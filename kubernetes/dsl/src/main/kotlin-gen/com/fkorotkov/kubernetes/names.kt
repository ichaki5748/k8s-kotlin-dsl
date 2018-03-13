// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ContainerImage
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNames
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec
import kotlin.collections.List


fun ContainerImage.`name`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`names`.add(newObject)
}


fun  CustomResourceDefinitionSpec.`names`(block: CustomResourceDefinitionNames.() -> Unit = {}) {
  if(this.`names` == null) {
    this.`names` = CustomResourceDefinitionNames()
  }

  this.`names`.block()
}

