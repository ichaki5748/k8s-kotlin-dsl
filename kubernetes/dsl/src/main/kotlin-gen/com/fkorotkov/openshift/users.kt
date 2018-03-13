// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.Group
import io.fabric8.openshift.api.model.SecurityContextConstraints
import io.fabric8.openshift.api.model.UserRestriction
import kotlin.collections.List


fun Group.`user`(value: kotlin.String) {
  this.`users`.add(value)
}


fun SecurityContextConstraints.`user`(value: kotlin.String) {
  this.`users`.add(value)
}


fun UserRestriction.`user`(value: kotlin.String) {
  this.`users`.add(value)
}

