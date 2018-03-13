// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Endpoints
import kotlin.collections.List


fun Endpoints.`subset`(block: io.fabric8.kubernetes.api.model.EndpointSubset.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.EndpointSubset()
  newObject.block()
  this.`subsets`.add(newObject)
}

