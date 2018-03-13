// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterRole
import io.fabric8.openshift.api.model.Role
import kotlin.collections.List


fun ClusterRole.`rule`(block: io.fabric8.openshift.api.model.PolicyRule.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.PolicyRule()
  newObject.block()
  this.`rules`.add(newObject)
}


fun Role.`rule`(block: io.fabric8.openshift.api.model.PolicyRule.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.PolicyRule()
  newObject.block()
  this.`rules`.add(newObject)
}

