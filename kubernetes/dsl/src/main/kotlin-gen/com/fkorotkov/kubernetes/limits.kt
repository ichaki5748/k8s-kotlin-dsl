// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.LimitRangeSpec
import kotlin.collections.List


fun LimitRangeSpec.`limit`(block: io.fabric8.kubernetes.api.model.LimitRangeItem.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.LimitRangeItem()
  newObject.block()
  this.`limits`.add(newObject)
}

