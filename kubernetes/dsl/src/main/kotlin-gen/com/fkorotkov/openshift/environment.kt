// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.CustomDeploymentStrategyParams
import kotlin.collections.List


fun CustomDeploymentStrategyParams.`environment`(block: io.fabric8.kubernetes.api.model.EnvVar.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.EnvVar()
  newObject.block()
  this.`environment`.add(newObject)
}

