// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ServiceSpec
import kotlin.collections.List


fun ServiceSpec.`loadBalancerSourceRange`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`loadBalancerSourceRanges`.add(newObject)
}

