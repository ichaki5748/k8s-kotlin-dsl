// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.Container
import io.fabric8.kubernetes.api.model.ExecAction
import kotlin.collections.List


fun Container.`command`(value: kotlin.String) {
  this.`command`.add(value)
}


fun ExecAction.`command`(value: kotlin.String) {
  this.`command`.add(value)
}

