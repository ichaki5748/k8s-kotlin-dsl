// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ContainerImage
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionNames
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionSpec
import kotlin.collections.List


fun ContainerImage.`name`(value: kotlin.String) {
  this.`names`.add(value)
}


fun  CustomResourceDefinitionSpec.`names`(block: CustomResourceDefinitionNames.() -> Unit = {}) {
  if(this.`names` == null) {
    this.`names` = CustomResourceDefinitionNames()
  }

  this.`names`.block()
}

