// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.LocalSubjectAccessReview
import io.fabric8.openshift.api.model.OAuthAccessToken
import io.fabric8.openshift.api.model.OAuthAuthorizeToken
import io.fabric8.openshift.api.model.OAuthClientAuthorization
import io.fabric8.openshift.api.model.SubjectAccessReview
import kotlin.collections.List


fun LocalSubjectAccessReview.`scope`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`scopes`.add(newObject)
}


fun OAuthAccessToken.`scope`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`scopes`.add(newObject)
}


fun OAuthAuthorizeToken.`scope`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`scopes`.add(newObject)
}


fun OAuthClientAuthorization.`scope`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`scopes`.add(newObject)
}


fun SubjectAccessReview.`scope`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`scopes`.add(newObject)
}

