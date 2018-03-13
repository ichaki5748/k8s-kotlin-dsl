// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec
import kotlin.collections.List


fun PodSecurityPolicySpec.`requiredDropCapabilitie`(value: kotlin.String) {
  this.`requiredDropCapabilities`.add(value)
}

