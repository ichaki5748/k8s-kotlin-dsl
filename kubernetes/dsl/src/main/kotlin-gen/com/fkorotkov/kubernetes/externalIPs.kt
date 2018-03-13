// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ServiceSpec
import kotlin.collections.List


fun ServiceSpec.`externalIP`(value: kotlin.String) {
  this.`externalIPs`.add(value)
}

