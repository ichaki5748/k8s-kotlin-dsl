// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildPostCommitSpec
import io.fabric8.openshift.api.model.CustomDeploymentStrategyParams
import io.fabric8.openshift.api.model.ExecNewPodHook
import kotlin.collections.List


fun BuildPostCommitSpec.`command`(value: kotlin.String) {
  this.`command`.add(value)
}


fun CustomDeploymentStrategyParams.`command`(value: kotlin.String) {
  this.`command`.add(value)
}


fun ExecNewPodHook.`command`(value: kotlin.String) {
  this.`command`.add(value)
}

