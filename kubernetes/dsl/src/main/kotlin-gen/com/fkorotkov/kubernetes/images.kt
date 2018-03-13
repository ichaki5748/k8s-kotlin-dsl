// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeStatus
import kotlin.collections.List


fun NodeStatus.`image`(block: io.fabric8.kubernetes.api.model.ContainerImage.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.ContainerImage()
  newObject.block()
  this.`images`.add(newObject)
}

