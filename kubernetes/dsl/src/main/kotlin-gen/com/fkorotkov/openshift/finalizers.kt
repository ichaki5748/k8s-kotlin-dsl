// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ProjectSpec
import kotlin.collections.List


fun ProjectSpec.`finalizer`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`finalizers`.add(newObject)
}

