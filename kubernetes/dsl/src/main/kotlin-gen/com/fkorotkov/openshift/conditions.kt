// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.DeploymentConfigStatus
import io.fabric8.openshift.api.model.ImageSignature
import io.fabric8.openshift.api.model.ImageStreamTag
import io.fabric8.openshift.api.model.NamedTagEventList
import io.fabric8.openshift.api.model.RouteIngress
import kotlin.collections.List


fun DeploymentConfigStatus.`condition`(block: io.fabric8.openshift.api.model.DeploymentCondition.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.DeploymentCondition()
  newObject.block()
  this.`conditions`.add(newObject)
}


fun ImageSignature.`condition`(block: io.fabric8.openshift.api.model.SignatureCondition.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.SignatureCondition()
  newObject.block()
  this.`conditions`.add(newObject)
}


fun ImageStreamTag.`condition`(block: io.fabric8.openshift.api.model.TagEventCondition.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.TagEventCondition()
  newObject.block()
  this.`conditions`.add(newObject)
}


fun NamedTagEventList.`condition`(block: io.fabric8.openshift.api.model.TagEventCondition.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.TagEventCondition()
  newObject.block()
  this.`conditions`.add(newObject)
}


fun RouteIngress.`condition`(block: io.fabric8.openshift.api.model.RouteIngressCondition.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.RouteIngressCondition()
  newObject.block()
  this.`conditions`.add(newObject)
}

