// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageSource
import kotlin.collections.List


fun ImageSource.`path`(block: io.fabric8.openshift.api.model.ImageSourcePath.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.ImageSourcePath()
  newObject.block()
  this.`paths`.add(newObject)
}

