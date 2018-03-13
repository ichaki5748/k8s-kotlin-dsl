// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNames
import kotlin.collections.List


fun CustomResourceDefinitionNames.`shortName`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`shortNames`.add(newObject)
}

