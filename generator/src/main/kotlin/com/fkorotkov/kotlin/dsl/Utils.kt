package com.fkorotkov.kotlin.dsl

import kotlin.reflect.KClass
import kotlin.reflect.KMutableProperty
import kotlin.reflect.KType
import kotlin.reflect.full.isSubclassOf


fun KMutableProperty<*>.isListWithNonAbstractObjects(): Boolean {

  val returnClass = this.returnType.classifier as KClass<*>

  if (returnClass.isSubclassOf(kotlin.collections.List::class)
      && this.returnType.arguments.size == 1) {

    val propertyClassifier = (this.returnType.arguments[0].type as KType).classifier as KClass<*>

    return !propertyClassifier.isAbstract
  } else {
    return false
  }
}
