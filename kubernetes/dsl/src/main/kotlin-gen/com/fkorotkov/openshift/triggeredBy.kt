// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildRequest
import io.fabric8.openshift.api.model.BuildSpec
import kotlin.collections.List


fun BuildRequest.`triggeredBy`(block: io.fabric8.openshift.api.model.BuildTriggerCause.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.BuildTriggerCause()
  newObject.block()
  this.`triggeredBy`.add(newObject)
}


fun BuildSpec.`triggeredBy`(block: io.fabric8.openshift.api.model.BuildTriggerCause.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.BuildTriggerCause()
  newObject.block()
  this.`triggeredBy`.add(newObject)
}

