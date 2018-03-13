// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodSpec
import kotlin.collections.List


fun PodSpec.`toleration`(block: io.fabric8.kubernetes.api.model.Toleration.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.Toleration()
  newObject.block()
  this.`tolerations`.add(newObject)
}

