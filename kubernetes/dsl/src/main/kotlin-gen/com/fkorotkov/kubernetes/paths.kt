// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.RootPaths
import io.fabric8.kubernetes.api.model.extensions.HTTPIngressRuleValue
import kotlin.collections.List


fun HTTPIngressRuleValue.`path`(block: io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.HTTPIngressPath()
  newObject.block()
  this.`paths`.add(newObject)
}


fun RootPaths.`path`(value: kotlin.String) {
  this.`paths`.add(value)
}

