// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ISCSIVolumeSource
import kotlin.collections.List


fun ISCSIVolumeSource.`portal`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`portals`.add(newObject)
}

