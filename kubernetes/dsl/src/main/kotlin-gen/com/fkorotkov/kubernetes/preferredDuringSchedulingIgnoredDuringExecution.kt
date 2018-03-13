// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.NodeAffinity
import io.fabric8.kubernetes.api.model.PodAffinity
import io.fabric8.kubernetes.api.model.PodAntiAffinity
import kotlin.collections.List


fun NodeAffinity.`preferredDuringSchedulingIgnoredDuringExecution`(block: io.fabric8.kubernetes.api.model.PreferredSchedulingTerm.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.PreferredSchedulingTerm()
  newObject.block()
  this.`preferredDuringSchedulingIgnoredDuringExecution`.add(newObject)
}


fun PodAffinity.`preferredDuringSchedulingIgnoredDuringExecution`(block: io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm()
  newObject.block()
  this.`preferredDuringSchedulingIgnoredDuringExecution`.add(newObject)
}


fun PodAntiAffinity.`preferredDuringSchedulingIgnoredDuringExecution`(block: io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.WeightedPodAffinityTerm()
  newObject.block()
  this.`preferredDuringSchedulingIgnoredDuringExecution`.add(newObject)
}

