// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParams
import kotlin.collections.List


fun DeploymentTriggerImageChangeParams.`containerName`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`containerNames`.add(newObject)
}

