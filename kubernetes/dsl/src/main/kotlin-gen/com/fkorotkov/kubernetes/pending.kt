// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Initializers
import kotlin.collections.List


fun Initializers.`pending`(block: io.fabric8.kubernetes.api.model.Initializer.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.Initializer()
  newObject.block()
  this.`pending`.add(newObject)
}

