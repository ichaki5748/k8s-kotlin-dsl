// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.SecurityContextConstraints
import kotlin.collections.List


fun SecurityContextConstraints.`seccompProfile`(value: kotlin.String) {
  this.`seccompProfiles`.add(value)
}

