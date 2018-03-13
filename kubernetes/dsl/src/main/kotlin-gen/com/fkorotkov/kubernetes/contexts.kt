// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Config
import kotlin.collections.List


fun Config.`context`(block: io.fabric8.kubernetes.api.model.NamedContext.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.NamedContext()
  newObject.block()
  this.`contexts`.add(newObject)
}

