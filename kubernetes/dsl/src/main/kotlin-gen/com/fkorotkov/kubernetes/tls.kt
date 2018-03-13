// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.IngressSpec
import kotlin.collections.List


fun IngressSpec.`tl`(block: io.fabric8.kubernetes.api.model.extensions.IngressTLS.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.IngressTLS()
  newObject.block()
  this.`tls`.add(newObject)
}

