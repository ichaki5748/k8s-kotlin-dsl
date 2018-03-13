// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterRoleScopeRestriction
import io.fabric8.openshift.api.model.ServiceAccountRestriction
import kotlin.collections.List


fun ClusterRoleScopeRestriction.`namespace`(value: kotlin.String) {
  this.`namespaces`.add(value)
}


fun ServiceAccountRestriction.`namespace`(value: kotlin.String) {
  this.`namespaces`.add(value)
}

