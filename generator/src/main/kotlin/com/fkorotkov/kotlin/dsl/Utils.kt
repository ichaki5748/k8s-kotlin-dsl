package com.fkorotkov.kotlin.dsl

import kotlin.reflect.KClass
import kotlin.reflect.KMutableProperty
import kotlin.reflect.KType


fun KMutableProperty<*>.isListWithNonAbstractObjects(): Boolean {

  val returnClass = this.returnType.classifier as KClass<*>

  if (returnClass.qualifiedName?.equals("kotlin.collections.List") == true
      && this.returnType.arguments.size == 1) {

    val propertyClassifier = (this.returnType.arguments[0].type as KType).classifier as KClass<*>

    return !propertyClassifier.isAbstract
  } else {
    return false
  }
}
