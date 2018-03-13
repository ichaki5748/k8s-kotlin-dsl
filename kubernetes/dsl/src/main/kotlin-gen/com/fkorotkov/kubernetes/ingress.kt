// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.LoadBalancerStatus
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicySpec
import kotlin.collections.List


fun LoadBalancerStatus.`ingres`(block: io.fabric8.kubernetes.api.model.LoadBalancerIngress.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.LoadBalancerIngress()
  newObject.block()
  this.`ingress`.add(newObject)
}


fun NetworkPolicySpec.`ingres`(block: io.fabric8.kubernetes.api.model.extensions.NetworkPolicyIngressRule.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.NetworkPolicyIngressRule()
  newObject.block()
  this.`ingress`.add(newObject)
}

