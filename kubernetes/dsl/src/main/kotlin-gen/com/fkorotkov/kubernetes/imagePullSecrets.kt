// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.PodSpec
import io.fabric8.kubernetes.api.model.ServiceAccount
import kotlin.collections.List


fun PodSpec.`imagePullSecret`(block: io.fabric8.kubernetes.api.model.LocalObjectReference.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.LocalObjectReference()
  newObject.block()
  this.`imagePullSecrets`.add(newObject)
}


fun ServiceAccount.`imagePullSecret`(block: io.fabric8.kubernetes.api.model.LocalObjectReference.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.LocalObjectReference()
  newObject.block()
  this.`imagePullSecrets`.add(newObject)
}

