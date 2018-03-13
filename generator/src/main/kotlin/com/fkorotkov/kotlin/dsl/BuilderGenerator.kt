package com.fkorotkov.kotlin.dsl

import java.io.File
import java.util.*
import kotlin.reflect.KClass
import kotlin.reflect.KMutableProperty
import kotlin.reflect.KType
import kotlin.reflect.full.isSubclassOf

object BuilderGenerator {
  fun generateBuildersForPropertyFile(
      outputFolder: File,
      outputPackage: String,
      outputFileName: String,
      clazzToProperties: List<Pair<KClass<*>, KMutableProperty<*>>>
  ) {
    val destinationFolder = File(outputFolder, outputPackage.replace('.', File.separatorChar))
    if (!destinationFolder.exists()) {
      destinationFolder.mkdirs()
    }
    val destinationFile = File(destinationFolder, outputFileName)
    destinationFile.createNewFile()

    val allClasses = clazzToProperties.flatMap { (clazz, property) ->
      listOf(clazz, property.returnType.classifier as KClass<*>)
    }

    destinationFile.writeText(generateBuilders(allClasses, clazzToProperties, outputPackage))
  }

  private fun generateBuilders(allClasses: List<KClass<*>>, clazzToProperties: List<Pair<KClass<*>, KMutableProperty<*>>>, outputPackage: String): String {

    return """// GENERATED
package $outputPackage

${
    allClasses.map { it.qualifiedName }.toSet().map { "import $it" }.sorted().joinToString("\n")
    }

${
    clazzToProperties.joinToString("\n") { (clazz, property) -> extensionFunctionTemplate(clazz, property) }
    }
"""
  }

  private fun extensionFunctionTemplate(clazz: KClass<*>, property: KMutableProperty<*>): String {

    if (property.isListWithNonAbstractObjects()) {
      val propertyClassifier = (property.returnType.arguments[0].type as KType).classifier as KClass<*>

      val singularName = if (property.name.endsWith("s")) property.name.dropLast(1) else property.name

      if (propertyClassifier.isSubclassOf(Number::class) || propertyClassifier.isSubclassOf(String::class)) {
        return """
fun ${clazz.simpleName}.`$singularName`(value: ${propertyClassifier.qualifiedName!!}) {
  this.`${property.name}`.add(value)
}
"""
      } else {

        return """
fun ${clazz.simpleName}.`$singularName`(block: ${propertyClassifier.qualifiedName!!}.() -> Unit = {}) {
  val newObject = ${propertyClassifier.qualifiedName!!}()
  newObject.block()
  this.`${property.name}`.add(newObject)
}
"""
      }
    } else {
      val returnClass = property.returnType.classifier as KClass<*>
      val generics: List<String> = (1..clazz.typeParameters.size).map { "T$it" }

      val clazzDecl = clazz.simpleName + genericsTemplate(generics)
      val returnClassDecl = returnClass.simpleName + genericsTemplate(Collections.nCopies(returnClass.typeParameters.size, "*"))

      return """
fun ${genericsTemplate(generics)} $clazzDecl.`${property.name}`(block: $returnClassDecl.() -> Unit = {}) {${initializer(property, returnClass)}
  this.`${property.name}`.block()
}
"""
    }
  }

  fun initializer(property: KMutableProperty<*>, returnClass: KClass<*>): String {
    if (returnClass.isAbstract) return ""
    return """
  if(this.`${property.name}` == null) {
    this.`${property.name}` = ${returnClass.simpleName}()
  }
"""
  }

  fun genericsTemplate(generics: List<String>): String {
    if (generics.isEmpty()) {
      return ""
    } else {
      return generics.joinToString(
          separator = ", ",
          prefix = "<",
          postfix = ">"
      )
    }
  }
}