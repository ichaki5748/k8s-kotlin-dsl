// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.SecurityContextConstraints
import kotlin.collections.List


fun SecurityContextConstraints.`seccompProfile`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`seccompProfiles`.add(newObject)
}

