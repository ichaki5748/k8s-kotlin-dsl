// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.ThirdPartyResource
import kotlin.collections.List


fun ThirdPartyResource.`version`(block: io.fabric8.kubernetes.api.model.extensions.APIVersion.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.APIVersion()
  newObject.block()
  this.`versions`.add(newObject)
}

