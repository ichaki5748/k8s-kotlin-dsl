// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodStatus
import kotlin.collections.List


fun PodStatus.`containerStatuse`(block: io.fabric8.kubernetes.api.model.ContainerStatus.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.ContainerStatus()
  newObject.block()
  this.`containerStatuses`.add(newObject)
}

