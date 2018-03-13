// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterRoleBinding
import io.fabric8.openshift.api.model.RoleBinding
import kotlin.collections.List


fun ClusterRoleBinding.`groupName`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`groupNames`.add(newObject)
}


fun RoleBinding.`groupName`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`groupNames`.add(newObject)
}

