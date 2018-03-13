// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterRoleBinding
import io.fabric8.openshift.api.model.RoleBinding
import kotlin.collections.List


fun ClusterRoleBinding.`userName`(value: kotlin.String) {
  this.`userNames`.add(value)
}


fun RoleBinding.`userName`(value: kotlin.String) {
  this.`userNames`.add(value)
}

