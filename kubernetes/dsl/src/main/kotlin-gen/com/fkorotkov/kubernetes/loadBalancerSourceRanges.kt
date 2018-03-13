// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ServiceSpec
import kotlin.collections.List


fun ServiceSpec.`loadBalancerSourceRange`(value: kotlin.String) {
  this.`loadBalancerSourceRanges`.add(value)
}

