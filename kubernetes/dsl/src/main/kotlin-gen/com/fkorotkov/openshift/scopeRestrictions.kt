// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OAuthClient
import kotlin.collections.List


fun OAuthClient.`scopeRestriction`(block: io.fabric8.openshift.api.model.ScopeRestriction.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.ScopeRestriction()
  newObject.block()
  this.`scopeRestrictions`.add(newObject)
}

