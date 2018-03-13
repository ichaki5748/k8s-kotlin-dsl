// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ResourceQuotaSpec
import kotlin.collections.List


fun ResourceQuotaSpec.`scope`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`scopes`.add(newObject)
}

