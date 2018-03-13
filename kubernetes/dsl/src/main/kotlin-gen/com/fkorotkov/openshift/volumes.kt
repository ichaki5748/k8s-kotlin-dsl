// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.ExecNewPodHook
import io.fabric8.openshift.api.model.SecurityContextConstraints
import kotlin.collections.List


fun ExecNewPodHook.`volume`(value: kotlin.String) {
  this.`volumes`.add(value)
}


fun SecurityContextConstraints.`volume`(value: kotlin.String) {
  this.`volumes`.add(value)
}

