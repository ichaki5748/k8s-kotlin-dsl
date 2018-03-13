// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NamespaceSpec
import io.fabric8.kubernetes.api.model.ObjectMeta
import kotlin.collections.List


fun NamespaceSpec.`finalizer`(value: kotlin.String) {
  this.`finalizers`.add(value)
}


fun ObjectMeta.`finalizer`(value: kotlin.String) {
  this.`finalizers`.add(value)
}

