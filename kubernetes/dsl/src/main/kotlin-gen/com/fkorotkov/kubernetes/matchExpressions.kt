// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.LabelSelector
import io.fabric8.kubernetes.api.model.NodeSelectorTerm
import kotlin.collections.List


fun LabelSelector.`matchExpression`(block: io.fabric8.kubernetes.api.model.LabelSelectorRequirement.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.LabelSelectorRequirement()
  newObject.block()
  this.`matchExpressions`.add(newObject)
}


fun NodeSelectorTerm.`matchExpression`(block: io.fabric8.kubernetes.api.model.NodeSelectorRequirement.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.NodeSelectorRequirement()
  newObject.block()
  this.`matchExpressions`.add(newObject)
}

