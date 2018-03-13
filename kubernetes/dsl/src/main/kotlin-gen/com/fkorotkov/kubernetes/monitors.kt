// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CephFSVolumeSource
import io.fabric8.kubernetes.api.model.RBDVolumeSource
import kotlin.collections.List


fun CephFSVolumeSource.`monitor`(value: kotlin.String) {
  this.`monitors`.add(value)
}


fun RBDVolumeSource.`monitor`(value: kotlin.String) {
  this.`monitors`.add(value)
}

