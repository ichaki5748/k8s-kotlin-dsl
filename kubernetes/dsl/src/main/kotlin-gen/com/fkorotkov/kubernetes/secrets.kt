// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ServiceAccount
import kotlin.collections.List


fun ServiceAccount.`secret`(block: io.fabric8.kubernetes.api.model.ObjectReference.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.ObjectReference()
  newObject.block()
  this.`secrets`.add(newObject)
}

