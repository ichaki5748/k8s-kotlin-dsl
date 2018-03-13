// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodSpec
import kotlin.collections.List


fun PodSpec.`container`(block: io.fabric8.kubernetes.api.model.Container.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.Container()
  newObject.block()
  this.`containers`.add(newObject)
}

