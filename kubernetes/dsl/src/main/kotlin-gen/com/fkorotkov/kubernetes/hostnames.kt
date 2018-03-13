// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.HostAlias
import kotlin.collections.List


fun HostAlias.`hostname`(value: kotlin.String) {
  this.`hostnames`.add(value)
}

