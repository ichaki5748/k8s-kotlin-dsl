// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container
import kotlin.collections.List


fun Container.`volumeMount`(block: io.fabric8.kubernetes.api.model.VolumeMount.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.VolumeMount()
  newObject.block()
  this.`volumeMounts`.add(newObject)
}

