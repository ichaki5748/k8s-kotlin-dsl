// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.StageInfo
import kotlin.collections.List


fun StageInfo.`step`(block: io.fabric8.openshift.api.model.StepInfo.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.StepInfo()
  newObject.block()
  this.`steps`.add(newObject)
}

