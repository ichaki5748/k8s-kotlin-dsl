// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.LabelSelectorRequirement
import io.fabric8.kubernetes.api.model.NodeSelectorRequirement
import kotlin.collections.List


fun LabelSelectorRequirement.`value`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`values`.add(newObject)
}


fun NodeSelectorRequirement.`value`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`values`.add(newObject)
}

