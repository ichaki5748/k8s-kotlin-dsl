// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.FCVolumeSource
import kotlin.collections.List


fun FCVolumeSource.`targetWWN`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`targetWWNs`.add(newObject)
}

