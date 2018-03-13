// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.GroupRestriction
import io.fabric8.openshift.api.model.LocalSubjectAccessReview
import io.fabric8.openshift.api.model.SecurityContextConstraints
import io.fabric8.openshift.api.model.SubjectAccessReview
import io.fabric8.openshift.api.model.User
import io.fabric8.openshift.api.model.UserRestriction
import kotlin.collections.List


fun GroupRestriction.`group`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`groups`.add(newObject)
}


fun LocalSubjectAccessReview.`group`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`groups`.add(newObject)
}


fun SecurityContextConstraints.`group`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`groups`.add(newObject)
}


fun SubjectAccessReview.`group`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`groups`.add(newObject)
}


fun User.`group`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`groups`.add(newObject)
}


fun UserRestriction.`group`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`groups`.add(newObject)
}

