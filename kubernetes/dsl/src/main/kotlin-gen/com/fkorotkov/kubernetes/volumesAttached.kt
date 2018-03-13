// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeStatus
import kotlin.collections.List


fun NodeStatus.`volumesAttached`(block: io.fabric8.kubernetes.api.model.AttachedVolume.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.AttachedVolume()
  newObject.block()
  this.`volumesAttached`.add(newObject)
}

