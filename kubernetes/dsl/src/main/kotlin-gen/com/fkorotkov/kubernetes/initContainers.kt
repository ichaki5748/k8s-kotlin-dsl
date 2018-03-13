// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodSpec
import kotlin.collections.List


fun PodSpec.`initContainer`(block: io.fabric8.kubernetes.api.model.Container.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.Container()
  newObject.block()
  this.`initContainers`.add(newObject)
}

