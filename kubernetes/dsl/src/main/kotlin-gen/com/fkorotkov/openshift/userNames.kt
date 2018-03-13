// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterRoleBinding
import io.fabric8.openshift.api.model.RoleBinding
import kotlin.collections.List


fun ClusterRoleBinding.`userName`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`userNames`.add(newObject)
}


fun RoleBinding.`userName`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`userNames`.add(newObject)
}

