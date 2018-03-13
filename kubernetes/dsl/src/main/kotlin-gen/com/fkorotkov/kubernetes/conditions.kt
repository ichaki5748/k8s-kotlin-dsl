// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ComponentStatus
import io.fabric8.kubernetes.api.model.JobStatus
import io.fabric8.kubernetes.api.model.NodeStatus
import io.fabric8.kubernetes.api.model.PodStatus
import io.fabric8.kubernetes.api.model.ReplicationControllerStatus
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionStatus
import io.fabric8.kubernetes.api.model.extensions.DeploymentStatus
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetStatus
import kotlin.collections.List


fun ComponentStatus.`condition`(block: io.fabric8.kubernetes.api.model.ComponentCondition.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.ComponentCondition()
  newObject.block()
  this.`conditions`.add(newObject)
}


fun CustomResourceDefinitionStatus.`condition`(block: io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionCondition.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionCondition()
  newObject.block()
  this.`conditions`.add(newObject)
}


fun DeploymentStatus.`condition`(block: io.fabric8.kubernetes.api.model.extensions.DeploymentCondition.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.DeploymentCondition()
  newObject.block()
  this.`conditions`.add(newObject)
}


fun JobStatus.`condition`(block: io.fabric8.kubernetes.api.model.JobCondition.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.JobCondition()
  newObject.block()
  this.`conditions`.add(newObject)
}


fun NodeStatus.`condition`(block: io.fabric8.kubernetes.api.model.NodeCondition.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.NodeCondition()
  newObject.block()
  this.`conditions`.add(newObject)
}


fun PodStatus.`condition`(block: io.fabric8.kubernetes.api.model.PodCondition.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.PodCondition()
  newObject.block()
  this.`conditions`.add(newObject)
}


fun ReplicaSetStatus.`condition`(block: io.fabric8.kubernetes.api.model.extensions.ReplicaSetCondition.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.ReplicaSetCondition()
  newObject.block()
  this.`conditions`.add(newObject)
}


fun ReplicationControllerStatus.`condition`(block: io.fabric8.kubernetes.api.model.ReplicationControllerCondition.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.ReplicationControllerCondition()
  newObject.block()
  this.`conditions`.add(newObject)
}

