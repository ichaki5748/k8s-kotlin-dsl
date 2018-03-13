// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OAuthClient
import kotlin.collections.List


fun OAuthClient.`additionalSecret`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`additionalSecrets`.add(newObject)
}

