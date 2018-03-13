// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.StatusDetails
import kotlin.collections.List


fun StatusDetails.`cause`(block: io.fabric8.kubernetes.api.model.StatusCause.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.StatusCause()
  newObject.block()
  this.`causes`.add(newObject)
}

