// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NamespaceSpec
import io.fabric8.kubernetes.api.model.ObjectMeta
import kotlin.collections.List


fun NamespaceSpec.`finalizer`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`finalizers`.add(newObject)
}


fun ObjectMeta.`finalizer`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`finalizers`.add(newObject)
}

