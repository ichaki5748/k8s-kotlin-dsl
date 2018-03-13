// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.Image
import kotlin.collections.List


fun Image.`signature`(block: io.fabric8.openshift.api.model.ImageSignature.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.ImageSignature()
  newObject.block()
  this.`signatures`.add(newObject)
}

