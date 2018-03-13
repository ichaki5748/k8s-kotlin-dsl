// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CephFSVolumeSource
import io.fabric8.kubernetes.api.model.RBDVolumeSource
import kotlin.collections.List


fun CephFSVolumeSource.`monitor`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`monitors`.add(newObject)
}


fun RBDVolumeSource.`monitor`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`monitors`.add(newObject)
}

