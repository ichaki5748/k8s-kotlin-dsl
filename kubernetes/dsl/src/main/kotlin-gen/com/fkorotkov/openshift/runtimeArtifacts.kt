// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.SourceBuildStrategy
import kotlin.collections.List


fun SourceBuildStrategy.`runtimeArtifact`(block: io.fabric8.openshift.api.model.ImageSourcePath.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.ImageSourcePath()
  newObject.block()
  this.`runtimeArtifacts`.add(newObject)
}

