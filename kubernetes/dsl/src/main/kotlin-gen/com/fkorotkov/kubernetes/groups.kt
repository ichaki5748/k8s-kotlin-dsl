// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.authentication.UserInfo
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpec
import kotlin.collections.List


fun SubjectAccessReviewSpec.`group`(value: kotlin.String) {
  this.`groups`.add(value)
}


fun UserInfo.`group`(value: kotlin.String) {
  this.`groups`.add(value)
}

