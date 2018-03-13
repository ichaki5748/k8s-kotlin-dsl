// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.extensions.IngressTLS
import kotlin.collections.List


fun IngressTLS.`host`(value: kotlin.String) {
  this.`hosts`.add(value)
}

