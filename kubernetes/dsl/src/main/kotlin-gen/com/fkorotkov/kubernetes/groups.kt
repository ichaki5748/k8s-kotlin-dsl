// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.authentication.UserInfo
import io.fabric8.kubernetes.api.model.authorization.SubjectAccessReviewSpec
import kotlin.collections.List


fun SubjectAccessReviewSpec.`group`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`groups`.add(newObject)
}


fun UserInfo.`group`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`groups`.add(newObject)
}

