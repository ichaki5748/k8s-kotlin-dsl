// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodSpec
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec
import kotlin.collections.List


fun PodSecurityPolicySpec.`volume`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`volumes`.add(newObject)
}


fun PodSpec.`volume`(block: io.fabric8.kubernetes.api.model.Volume.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.Volume()
  newObject.block()
  this.`volumes`.add(newObject)
}

