// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DeploymentTriggerImageChangeParams
import kotlin.collections.List


fun DeploymentTriggerImageChangeParams.`containerName`(value: kotlin.String) {
  this.`containerNames`.add(value)
}

