// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Config
import kotlin.collections.List


fun Config.`user`(block: io.fabric8.kubernetes.api.model.NamedAuthInfo.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.NamedAuthInfo()
  newObject.block()
  this.`users`.add(newObject)
}

