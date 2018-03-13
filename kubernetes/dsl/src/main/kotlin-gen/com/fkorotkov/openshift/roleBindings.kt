// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterPolicyBinding
import io.fabric8.openshift.api.model.PolicyBinding
import kotlin.collections.List


fun ClusterPolicyBinding.`roleBinding`(block: io.fabric8.openshift.api.model.NamedClusterRoleBinding.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.NamedClusterRoleBinding()
  newObject.block()
  this.`roleBindings`.add(newObject)
}


fun PolicyBinding.`roleBinding`(block: io.fabric8.openshift.api.model.NamedRoleBinding.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.NamedRoleBinding()
  newObject.block()
  this.`roleBindings`.add(newObject)
}

