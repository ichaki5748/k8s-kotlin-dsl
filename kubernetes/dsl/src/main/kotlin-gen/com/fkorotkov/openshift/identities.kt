// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.User
import kotlin.collections.List


fun User.`identitie`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`identities`.add(newObject)
}

