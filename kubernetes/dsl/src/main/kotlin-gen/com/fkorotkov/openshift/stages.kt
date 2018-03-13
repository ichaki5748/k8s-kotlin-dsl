// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildStatus
import kotlin.collections.List


fun BuildStatus.`stage`(block: io.fabric8.openshift.api.model.StageInfo.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.StageInfo()
  newObject.block()
  this.`stages`.add(newObject)
}

