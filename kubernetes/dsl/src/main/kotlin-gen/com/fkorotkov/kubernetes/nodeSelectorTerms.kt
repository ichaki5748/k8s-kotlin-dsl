// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeSelector
import kotlin.collections.List


fun NodeSelector.`nodeSelectorTerm`(block: io.fabric8.kubernetes.api.model.NodeSelectorTerm.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.NodeSelectorTerm()
  newObject.block()
  this.`nodeSelectorTerms`.add(newObject)
}

