// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.HTTPGetAction
import kotlin.collections.List


fun HTTPGetAction.`httpHeader`(block: io.fabric8.kubernetes.api.model.HTTPHeader.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.HTTPHeader()
  newObject.block()
  this.`httpHeaders`.add(newObject)
}

