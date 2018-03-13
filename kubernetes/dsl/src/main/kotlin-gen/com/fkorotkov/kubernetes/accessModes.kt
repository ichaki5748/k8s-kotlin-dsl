// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PersistentVolumeClaimSpec
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimStatus
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import kotlin.collections.List


fun PersistentVolumeClaimSpec.`accessMode`(value: kotlin.String) {
  this.`accessModes`.add(value)
}


fun PersistentVolumeClaimStatus.`accessMode`(value: kotlin.String) {
  this.`accessModes`.add(value)
}


fun PersistentVolumeSpec.`accessMode`(value: kotlin.String) {
  this.`accessModes`.add(value)
}

