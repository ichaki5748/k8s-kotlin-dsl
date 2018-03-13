// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterRoleBinding
import io.fabric8.openshift.api.model.RoleBinding
import kotlin.collections.List


fun ClusterRoleBinding.`subject`(block: io.fabric8.kubernetes.api.model.ObjectReference.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.ObjectReference()
  newObject.block()
  this.`subjects`.add(newObject)
}


fun RoleBinding.`subject`(block: io.fabric8.kubernetes.api.model.ObjectReference.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.ObjectReference()
  newObject.block()
  this.`subjects`.add(newObject)
}

