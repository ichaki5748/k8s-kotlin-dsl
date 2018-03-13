// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.LifecycleHook
import kotlin.collections.List


fun LifecycleHook.`tagImage`(block: io.fabric8.openshift.api.model.TagImageHook.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.TagImageHook()
  newObject.block()
  this.`tagImages`.add(newObject)
}

