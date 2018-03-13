// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ObjectMeta
import kotlin.collections.List


fun ObjectMeta.`ownerReference`(block: io.fabric8.kubernetes.api.model.OwnerReference.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.OwnerReference()
  newObject.block()
  this.`ownerReferences`.add(newObject)
}

