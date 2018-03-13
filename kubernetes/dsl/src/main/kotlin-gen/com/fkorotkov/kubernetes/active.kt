// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.CronJobStatus
import kotlin.collections.List


fun CronJobStatus.`active`(block: io.fabric8.kubernetes.api.model.ObjectReference.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.ObjectReference()
  newObject.block()
  this.`active`.add(newObject)
}

