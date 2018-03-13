// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ScopeRestriction
import kotlin.collections.List


fun ScopeRestriction.`literal`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`literals`.add(newObject)
}

