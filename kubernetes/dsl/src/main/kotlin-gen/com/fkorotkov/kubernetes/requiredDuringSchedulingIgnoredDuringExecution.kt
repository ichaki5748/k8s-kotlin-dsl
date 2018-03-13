// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeAffinity
import io.fabric8.kubernetes.api.model.NodeSelector
import io.fabric8.kubernetes.api.model.PodAffinity
import io.fabric8.kubernetes.api.model.PodAntiAffinity
import kotlin.collections.List


fun  NodeAffinity.`requiredDuringSchedulingIgnoredDuringExecution`(block: NodeSelector.() -> Unit = {}) {
  if(this.`requiredDuringSchedulingIgnoredDuringExecution` == null) {
    this.`requiredDuringSchedulingIgnoredDuringExecution` = NodeSelector()
  }

  this.`requiredDuringSchedulingIgnoredDuringExecution`.block()
}


fun PodAffinity.`requiredDuringSchedulingIgnoredDuringExecution`(block: io.fabric8.kubernetes.api.model.PodAffinityTerm.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.PodAffinityTerm()
  newObject.block()
  this.`requiredDuringSchedulingIgnoredDuringExecution`.add(newObject)
}


fun PodAntiAffinity.`requiredDuringSchedulingIgnoredDuringExecution`(block: io.fabric8.kubernetes.api.model.PodAffinityTerm.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.PodAffinityTerm()
  newObject.block()
  this.`requiredDuringSchedulingIgnoredDuringExecution`.add(newObject)
}

