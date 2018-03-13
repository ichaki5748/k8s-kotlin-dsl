// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ServiceAccountRestriction
import kotlin.collections.List


fun ServiceAccountRestriction.`serviceaccount`(block: io.fabric8.openshift.api.model.ServiceAccountReference.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.ServiceAccountReference()
  newObject.block()
  this.`serviceaccounts`.add(newObject)
}

