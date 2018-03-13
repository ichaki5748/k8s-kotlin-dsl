// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildSource
import kotlin.collections.List


fun BuildSource.`image`(block: io.fabric8.openshift.api.model.ImageSource.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.ImageSource()
  newObject.block()
  this.`images`.add(newObject)
}

