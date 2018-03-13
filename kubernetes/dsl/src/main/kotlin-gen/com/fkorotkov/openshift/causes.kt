// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DeploymentDetails
import kotlin.collections.List


fun DeploymentDetails.`cause`(block: io.fabric8.openshift.api.model.DeploymentCause.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.DeploymentCause()
  newObject.block()
  this.`causes`.add(newObject)
}

