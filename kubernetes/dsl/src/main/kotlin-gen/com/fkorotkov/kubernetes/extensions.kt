// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.AuthInfo
import io.fabric8.kubernetes.api.model.Cluster
import io.fabric8.kubernetes.api.model.Config
import io.fabric8.kubernetes.api.model.Context
import io.fabric8.kubernetes.api.model.Preferences
import kotlin.collections.List


fun AuthInfo.`extension`(block: io.fabric8.kubernetes.api.model.NamedExtension.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.NamedExtension()
  newObject.block()
  this.`extensions`.add(newObject)
}


fun Cluster.`extension`(block: io.fabric8.kubernetes.api.model.NamedExtension.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.NamedExtension()
  newObject.block()
  this.`extensions`.add(newObject)
}


fun Config.`extension`(block: io.fabric8.kubernetes.api.model.NamedExtension.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.NamedExtension()
  newObject.block()
  this.`extensions`.add(newObject)
}


fun Context.`extension`(block: io.fabric8.kubernetes.api.model.NamedExtension.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.NamedExtension()
  newObject.block()
  this.`extensions`.add(newObject)
}


fun Preferences.`extension`(block: io.fabric8.kubernetes.api.model.NamedExtension.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.NamedExtension()
  newObject.block()
  this.`extensions`.add(newObject)
}

