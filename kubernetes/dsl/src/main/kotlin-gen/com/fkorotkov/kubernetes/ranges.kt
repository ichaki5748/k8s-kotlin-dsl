// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.FSGroupStrategyOptions
import io.fabric8.kubernetes.api.model.extensions.KubernetesRunAsUserStrategyOptions
import io.fabric8.kubernetes.api.model.extensions.SupplementalGroupsStrategyOptions
import kotlin.collections.List


fun FSGroupStrategyOptions.`range`(block: io.fabric8.kubernetes.api.model.extensions.IDRange.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.IDRange()
  newObject.block()
  this.`ranges`.add(newObject)
}


fun KubernetesRunAsUserStrategyOptions.`range`(block: io.fabric8.kubernetes.api.model.extensions.IDRange.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.IDRange()
  newObject.block()
  this.`ranges`.add(newObject)
}


fun SupplementalGroupsStrategyOptions.`range`(block: io.fabric8.kubernetes.api.model.extensions.IDRange.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.IDRange()
  newObject.block()
  this.`ranges`.add(newObject)
}

