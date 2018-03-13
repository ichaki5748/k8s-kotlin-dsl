// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeSpec
import kotlin.collections.List


fun NodeSpec.`taint`(block: io.fabric8.kubernetes.api.model.Taint.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.Taint()
  newObject.block()
  this.`taints`.add(newObject)
}

