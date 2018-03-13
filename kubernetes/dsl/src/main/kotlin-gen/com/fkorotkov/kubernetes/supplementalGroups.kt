// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodSecurityContext
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicySpec
import io.fabric8.kubernetes.api.model.extensions.SupplementalGroupsStrategyOptions
import kotlin.collections.List


fun PodSecurityContext.`supplementalGroup`(value: kotlin.Long) {
  this.`supplementalGroups`.add(value)
}


fun  PodSecurityPolicySpec.`supplementalGroups`(block: SupplementalGroupsStrategyOptions.() -> Unit = {}) {
  if(this.`supplementalGroups` == null) {
    this.`supplementalGroups` = SupplementalGroupsStrategyOptions()
  }

  this.`supplementalGroups`.block()
}

