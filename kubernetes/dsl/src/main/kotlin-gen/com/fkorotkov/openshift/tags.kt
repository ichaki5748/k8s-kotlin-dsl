// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ImageStreamSpec
import io.fabric8.openshift.api.model.ImageStreamStatus
import kotlin.collections.List


fun ImageStreamSpec.`tag`(block: io.fabric8.openshift.api.model.TagReference.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.TagReference()
  newObject.block()
  this.`tags`.add(newObject)
}


fun ImageStreamStatus.`tag`(block: io.fabric8.openshift.api.model.NamedTagEventList.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.NamedTagEventList()
  newObject.block()
  this.`tags`.add(newObject)
}

