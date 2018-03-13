// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterRoleScopeRestriction
import io.fabric8.openshift.api.model.ServiceAccountRestriction
import kotlin.collections.List


fun ClusterRoleScopeRestriction.`namespace`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`namespaces`.add(newObject)
}


fun ServiceAccountRestriction.`namespace`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`namespaces`.add(newObject)
}

