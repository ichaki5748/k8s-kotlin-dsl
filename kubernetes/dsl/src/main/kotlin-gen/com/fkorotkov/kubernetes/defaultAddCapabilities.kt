// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec
import kotlin.collections.List


fun PodSecurityPolicySpec.`defaultAddCapabilitie`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`defaultAddCapabilities`.add(newObject)
}

