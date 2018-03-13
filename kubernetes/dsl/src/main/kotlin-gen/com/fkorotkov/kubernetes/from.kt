// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyIngressRule
import kotlin.collections.List


fun NetworkPolicyIngressRule.`from`(block: io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.NetworkPolicyPeer()
  newObject.block()
  this.`from`.add(newObject)
}

