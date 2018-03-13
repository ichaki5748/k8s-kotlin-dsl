// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ServiceSpec
import kotlin.collections.List


fun ServiceSpec.`externalIP`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`externalIPs`.add(newObject)
}

