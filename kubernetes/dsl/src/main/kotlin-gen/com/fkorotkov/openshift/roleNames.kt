// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterRoleScopeRestriction
import kotlin.collections.List


fun ClusterRoleScopeRestriction.`roleName`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`roleNames`.add(newObject)
}

