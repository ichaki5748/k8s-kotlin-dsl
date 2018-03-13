// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.HostAlias
import kotlin.collections.List


fun HostAlias.`hostname`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`hostnames`.add(newObject)
}

