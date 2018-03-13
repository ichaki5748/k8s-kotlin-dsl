// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.RouteStatus
import kotlin.collections.List


fun RouteStatus.`ingres`(block: io.fabric8.openshift.api.model.RouteIngress.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.RouteIngress()
  newObject.block()
  this.`ingress`.add(newObject)
}

