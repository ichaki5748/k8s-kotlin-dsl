// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ExecNewPodHook
import io.fabric8.openshift.api.model.SecurityContextConstraints
import kotlin.collections.List


fun ExecNewPodHook.`volume`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`volumes`.add(newObject)
}


fun SecurityContextConstraints.`volume`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`volumes`.add(newObject)
}

