// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.RouteSpec
import kotlin.collections.List


fun RouteSpec.`alternateBackend`(block: io.fabric8.openshift.api.model.RouteTargetReference.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.RouteTargetReference()
  newObject.block()
  this.`alternateBackends`.add(newObject)
}

