// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Config
import kotlin.collections.List


fun Config.`cluster`(block: io.fabric8.kubernetes.api.model.NamedCluster.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.NamedCluster()
  newObject.block()
  this.`clusters`.add(newObject)
}

