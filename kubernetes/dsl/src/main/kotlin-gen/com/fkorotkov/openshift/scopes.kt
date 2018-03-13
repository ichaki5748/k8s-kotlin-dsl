// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.LocalSubjectAccessReview
import io.fabric8.openshift.api.model.OAuthAccessToken
import io.fabric8.openshift.api.model.OAuthAuthorizeToken
import io.fabric8.openshift.api.model.OAuthClientAuthorization
import io.fabric8.openshift.api.model.SubjectAccessReview
import kotlin.collections.List


fun LocalSubjectAccessReview.`scope`(value: kotlin.String) {
  this.`scopes`.add(value)
}


fun OAuthAccessToken.`scope`(value: kotlin.String) {
  this.`scopes`.add(value)
}


fun OAuthAuthorizeToken.`scope`(value: kotlin.String) {
  this.`scopes`.add(value)
}


fun OAuthClientAuthorization.`scope`(value: kotlin.String) {
  this.`scopes`.add(value)
}


fun SubjectAccessReview.`scope`(value: kotlin.String) {
  this.`scopes`.add(value)
}

