// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ProjectedVolumeSource
import kotlin.collections.List


fun ProjectedVolumeSource.`source`(block: io.fabric8.kubernetes.api.model.VolumeProjection.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.VolumeProjection()
  newObject.block()
  this.`sources`.add(newObject)
}

