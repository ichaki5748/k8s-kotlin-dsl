// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.IngressTLS
import kotlin.collections.List


fun IngressTLS.`host`(block: kotlin.String.() -> Unit = {}) {
  val newObject = kotlin.String()
  newObject.block()
  this.`hosts`.add(newObject)
}

