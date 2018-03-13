// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildPostCommitSpec
import kotlin.collections.List


fun BuildPostCommitSpec.`arg`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`args`.add(newObject)
}

