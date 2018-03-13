// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodSpec
import kotlin.collections.List


fun PodSpec.`hostAliase`(block: io.fabric8.kubernetes.api.model.HostAlias.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.HostAlias()
  newObject.block()
  this.`hostAliases`.add(newObject)
}

