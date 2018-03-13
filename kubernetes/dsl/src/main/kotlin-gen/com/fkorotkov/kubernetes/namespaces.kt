// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodAffinityTerm
import kotlin.collections.List


fun PodAffinityTerm.`namespace`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`namespaces`.add(newObject)
}

