// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container
import kotlin.collections.List


fun Container.`envFrom`(block: io.fabric8.kubernetes.api.model.EnvFromSource.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.EnvFromSource()
  newObject.block()
  this.`envFrom`.add(newObject)
}

