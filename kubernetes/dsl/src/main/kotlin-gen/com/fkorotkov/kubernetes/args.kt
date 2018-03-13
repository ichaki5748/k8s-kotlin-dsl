// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container
import kotlin.collections.List


fun Container.`arg`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`args`.add(newObject)
}

