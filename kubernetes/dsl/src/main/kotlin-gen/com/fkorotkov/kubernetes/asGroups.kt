// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AuthInfo
import kotlin.collections.List


fun AuthInfo.`asGroup`(value: kotlin.String) {
  this.`asGroups`.add(value)
}

