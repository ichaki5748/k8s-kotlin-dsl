// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.Group
import io.fabric8.openshift.api.model.SecurityContextConstraints
import io.fabric8.openshift.api.model.UserRestriction
import kotlin.collections.List


fun Group.`user`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`users`.add(newObject)
}


fun SecurityContextConstraints.`user`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`users`.add(newObject)
}


fun UserRestriction.`user`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`users`.add(newObject)
}

