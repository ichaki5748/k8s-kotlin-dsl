// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodAffinityTerm
import kotlin.collections.List


fun PodAffinityTerm.`namespace`(value: kotlin.String) {
  this.`namespaces`.add(value)
}

