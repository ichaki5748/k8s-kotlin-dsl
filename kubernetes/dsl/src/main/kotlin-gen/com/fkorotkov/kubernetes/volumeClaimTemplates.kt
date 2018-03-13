// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.StatefulSetSpec
import kotlin.collections.List


fun StatefulSetSpec.`volumeClaimTemplate`(block: io.fabric8.kubernetes.api.model.PersistentVolumeClaim.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.PersistentVolumeClaim()
  newObject.block()
  this.`volumeClaimTemplates`.add(newObject)
}

