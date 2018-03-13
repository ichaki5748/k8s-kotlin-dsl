// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.PolicyRule
import kotlin.collections.List


fun PolicyRule.`apiGroup`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`apiGroups`.add(newObject)
}

