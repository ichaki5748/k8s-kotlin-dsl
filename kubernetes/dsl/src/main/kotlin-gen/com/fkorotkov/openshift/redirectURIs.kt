// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.OAuthClient
import kotlin.collections.List


fun OAuthClient.`redirectURI`(value: kotlin.String) {
  this.`redirectURIs`.add(value)
}

