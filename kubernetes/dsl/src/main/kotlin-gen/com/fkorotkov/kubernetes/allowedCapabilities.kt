// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec
import kotlin.collections.List


fun PodSecurityPolicySpec.`allowedCapabilitie`(value: kotlin.String) {
  this.`allowedCapabilities`.add(value)
}

