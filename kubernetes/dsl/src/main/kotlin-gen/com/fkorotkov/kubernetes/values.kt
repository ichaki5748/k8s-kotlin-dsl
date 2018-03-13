// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.LabelSelectorRequirement
import io.fabric8.kubernetes.api.model.NodeSelectorRequirement
import kotlin.collections.List


fun LabelSelectorRequirement.`value`(value: kotlin.String) {
  this.`values`.add(value)
}


fun NodeSelectorRequirement.`value`(value: kotlin.String) {
  this.`values`.add(value)
}

