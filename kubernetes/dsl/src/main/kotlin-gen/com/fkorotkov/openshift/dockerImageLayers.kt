// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.Image
import kotlin.collections.List


fun Image.`dockerImageLayer`(block: io.fabric8.openshift.api.model.ImageLayer.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.ImageLayer()
  newObject.block()
  this.`dockerImageLayers`.add(newObject)
}

