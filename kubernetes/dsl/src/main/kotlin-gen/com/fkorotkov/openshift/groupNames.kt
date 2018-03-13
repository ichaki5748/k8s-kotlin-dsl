// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ClusterRoleBinding
import io.fabric8.openshift.api.model.RoleBinding
import kotlin.collections.List


fun ClusterRoleBinding.`groupName`(value: kotlin.String) {
  this.`groupNames`.add(value)
}


fun RoleBinding.`groupName`(value: kotlin.String) {
  this.`groupNames`.add(value)
}

