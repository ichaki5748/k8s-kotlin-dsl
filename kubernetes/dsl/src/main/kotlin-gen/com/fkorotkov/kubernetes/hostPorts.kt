// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec
import kotlin.collections.List


fun PodSecurityPolicySpec.`hostPort`(block: io.fabric8.kubernetes.api.model.extensions.HostPortRange.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.HostPortRange()
  newObject.block()
  this.`hostPorts`.add(newObject)
}

