// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildRequest
import io.fabric8.openshift.api.model.CustomBuildStrategy
import io.fabric8.openshift.api.model.DockerBuildStrategy
import io.fabric8.openshift.api.model.ExecNewPodHook
import io.fabric8.openshift.api.model.JenkinsPipelineBuildStrategy
import io.fabric8.openshift.api.model.SourceBuildStrategy
import kotlin.collections.List


fun BuildRequest.`env`(block: io.fabric8.kubernetes.api.model.EnvVar.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.EnvVar()
  newObject.block()
  this.`env`.add(newObject)
}


fun CustomBuildStrategy.`env`(block: io.fabric8.kubernetes.api.model.EnvVar.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.EnvVar()
  newObject.block()
  this.`env`.add(newObject)
}


fun DockerBuildStrategy.`env`(block: io.fabric8.kubernetes.api.model.EnvVar.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.EnvVar()
  newObject.block()
  this.`env`.add(newObject)
}


fun ExecNewPodHook.`env`(block: io.fabric8.kubernetes.api.model.EnvVar.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.EnvVar()
  newObject.block()
  this.`env`.add(newObject)
}


fun JenkinsPipelineBuildStrategy.`env`(block: io.fabric8.kubernetes.api.model.EnvVar.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.EnvVar()
  newObject.block()
  this.`env`.add(newObject)
}


fun SourceBuildStrategy.`env`(block: io.fabric8.kubernetes.api.model.EnvVar.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.EnvVar()
  newObject.block()
  this.`env`.add(newObject)
}

