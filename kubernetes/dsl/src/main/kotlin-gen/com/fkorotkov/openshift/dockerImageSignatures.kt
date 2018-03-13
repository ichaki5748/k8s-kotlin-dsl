// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.Image
import kotlin.collections.List


fun Image.`dockerImageSignature`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`dockerImageSignatures`.add(newObject)
}

