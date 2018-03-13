// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EndpointSubset
import kotlin.collections.List


fun EndpointSubset.`notReadyAddresse`(block: io.fabric8.kubernetes.api.model.EndpointAddress.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.EndpointAddress()
  newObject.block()
  this.`notReadyAddresses`.add(newObject)
}

