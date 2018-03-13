// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildSource
import io.fabric8.openshift.api.model.CustomBuildStrategy
import kotlin.collections.List


fun BuildSource.`secret`(block: io.fabric8.openshift.api.model.SecretBuildSource.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.SecretBuildSource()
  newObject.block()
  this.`secrets`.add(newObject)
}


fun CustomBuildStrategy.`secret`(block: io.fabric8.openshift.api.model.SecretSpec.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.SecretSpec()
  newObject.block()
  this.`secrets`.add(newObject)
}

