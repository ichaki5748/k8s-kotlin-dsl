// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimStatus
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import kotlin.collections.List


fun PersistentVolumeClaimSpec.`accessMode`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`accessModes`.add(newObject)
}


fun PersistentVolumeClaimStatus.`accessMode`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`accessModes`.add(newObject)
}


fun PersistentVolumeSpec.`accessMode`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`accessModes`.add(newObject)
}

