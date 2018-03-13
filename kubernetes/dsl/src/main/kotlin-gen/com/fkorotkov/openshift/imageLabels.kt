// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildOutput
import kotlin.collections.List


fun BuildOutput.`imageLabel`(block: io.fabric8.openshift.api.model.ImageLabel.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.ImageLabel()
  newObject.block()
  this.`imageLabels`.add(newObject)
}

