// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildConfigSpec
import io.fabric8.openshift.api.model.DeploymentConfigSpec
import kotlin.collections.List


fun BuildConfigSpec.`trigger`(block: io.fabric8.openshift.api.model.BuildTriggerPolicy.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.BuildTriggerPolicy()
  newObject.block()
  this.`triggers`.add(newObject)
}


fun DeploymentConfigSpec.`trigger`(block: io.fabric8.openshift.api.model.DeploymentTriggerPolicy.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.DeploymentTriggerPolicy()
  newObject.block()
  this.`triggers`.add(newObject)
}

