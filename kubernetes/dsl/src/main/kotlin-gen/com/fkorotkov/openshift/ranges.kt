// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.FSGroupStrategyOptions
import io.fabric8.openshift.api.model.SupplementalGroupsStrategyOptions
import kotlin.collections.List


fun FSGroupStrategyOptions.`range`(block: io.fabric8.openshift.api.model.IDRange.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.IDRange()
  newObject.block()
  this.`ranges`.add(newObject)
}


fun SupplementalGroupsStrategyOptions.`range`(block: io.fabric8.openshift.api.model.IDRange.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.IDRange()
  newObject.block()
  this.`ranges`.add(newObject)
}

