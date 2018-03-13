// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterPolicy
import io.fabric8.openshift.api.model.Policy
import kotlin.collections.List


fun ClusterPolicy.`role`(block: io.fabric8.openshift.api.model.NamedClusterRole.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.NamedClusterRole()
  newObject.block()
  this.`roles`.add(newObject)
}


fun Policy.`role`(block: io.fabric8.openshift.api.model.NamedRole.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.NamedRole()
  newObject.block()
  this.`roles`.add(newObject)
}

