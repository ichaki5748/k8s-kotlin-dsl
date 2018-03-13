// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.IngressSpec
import kotlin.collections.List


fun IngressSpec.`rule`(block: io.fabric8.kubernetes.api.model.extensions.IngressRule.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.IngressRule()
  newObject.block()
  this.`rules`.add(newObject)
}

