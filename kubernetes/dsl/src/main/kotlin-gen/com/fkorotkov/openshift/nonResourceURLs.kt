// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.PolicyRule
import kotlin.collections.List


fun PolicyRule.`nonResourceURL`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`nonResourceURLs`.add(newObject)
}

