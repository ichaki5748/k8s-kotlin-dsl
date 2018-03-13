// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.GroupRestriction
import io.fabric8.openshift.api.model.LocalSubjectAccessReview
import io.fabric8.openshift.api.model.SecurityContextConstraints
import io.fabric8.openshift.api.model.SubjectAccessReview
import io.fabric8.openshift.api.model.User
import io.fabric8.openshift.api.model.UserRestriction
import kotlin.collections.List


fun GroupRestriction.`group`(value: kotlin.String) {
  this.`groups`.add(value)
}


fun LocalSubjectAccessReview.`group`(value: kotlin.String) {
  this.`groups`.add(value)
}


fun SecurityContextConstraints.`group`(value: kotlin.String) {
  this.`groups`.add(value)
}


fun SubjectAccessReview.`group`(value: kotlin.String) {
  this.`groups`.add(value)
}


fun User.`group`(value: kotlin.String) {
  this.`groups`.add(value)
}


fun UserRestriction.`group`(value: kotlin.String) {
  this.`groups`.add(value)
}

