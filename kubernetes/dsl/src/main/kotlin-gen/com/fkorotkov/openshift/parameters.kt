// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.Template
import kotlin.collections.List


fun Template.`parameter`(block: io.fabric8.openshift.api.model.Parameter.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.Parameter()
  newObject.block()
  this.`parameters`.add(newObject)
}

