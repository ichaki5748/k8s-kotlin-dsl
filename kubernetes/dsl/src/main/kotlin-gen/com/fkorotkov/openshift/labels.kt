// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.GroupRestriction
import io.fabric8.openshift.api.model.UserRestriction
import kotlin.collections.List


fun GroupRestriction.`label`(block: io.fabric8.kubernetes.api.model.LabelSelector.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.LabelSelector()
  newObject.block()
  this.`labels`.add(newObject)
}


fun UserRestriction.`label`(block: io.fabric8.kubernetes.api.model.LabelSelector.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.LabelSelector()
  newObject.block()
  this.`labels`.add(newObject)
}

