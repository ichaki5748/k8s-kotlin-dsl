// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container
import io.fabric8.kubernetes.api.model.EndpointSubset
import io.fabric8.kubernetes.api.model.ServiceSpec
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyIngressRule
import kotlin.collections.List


fun Container.`port`(block: io.fabric8.kubernetes.api.model.ContainerPort.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.ContainerPort()
  newObject.block()
  this.`ports`.add(newObject)
}


fun EndpointSubset.`port`(block: io.fabric8.kubernetes.api.model.EndpointPort.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.EndpointPort()
  newObject.block()
  this.`ports`.add(newObject)
}


fun NetworkPolicyIngressRule.`port`(block: io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPort.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPort()
  newObject.block()
  this.`ports`.add(newObject)
}


fun ServiceSpec.`port`(block: io.fabric8.kubernetes.api.model.ServicePort.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.ServicePort()
  newObject.block()
  this.`ports`.add(newObject)
}

