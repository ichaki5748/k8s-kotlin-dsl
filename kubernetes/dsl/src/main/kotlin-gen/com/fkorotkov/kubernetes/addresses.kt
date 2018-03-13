// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.EndpointSubset
import io.fabric8.kubernetes.api.model.NodeStatus
import kotlin.collections.List


fun EndpointSubset.`addresse`(block: io.fabric8.kubernetes.api.model.EndpointAddress.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.EndpointAddress()
  newObject.block()
  this.`addresses`.add(newObject)
}


fun NodeStatus.`addresse`(block: io.fabric8.kubernetes.api.model.NodeAddress.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.NodeAddress()
  newObject.block()
  this.`addresses`.add(newObject)
}

