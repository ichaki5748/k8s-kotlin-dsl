// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container
import kotlin.collections.List


fun Container.`env`(block: io.fabric8.kubernetes.api.model.EnvVar.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.EnvVar()
  newObject.block()
  this.`env`.add(newObject)
}

