// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DockerBuildStrategy
import io.fabric8.openshift.api.model.DockerStrategyOptions
import kotlin.collections.List


fun DockerBuildStrategy.`buildArg`(block: io.fabric8.kubernetes.api.model.EnvVar.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.EnvVar()
  newObject.block()
  this.`buildArgs`.add(newObject)
}


fun DockerStrategyOptions.`buildArg`(block: io.fabric8.kubernetes.api.model.EnvVar.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.EnvVar()
  newObject.block()
  this.`buildArgs`.add(newObject)
}

