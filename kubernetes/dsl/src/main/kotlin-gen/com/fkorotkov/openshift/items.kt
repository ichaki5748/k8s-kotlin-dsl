// GENERATED
package com.fkorotkov.openshift

import io.fabric8.openshift.api.model.BuildConfigList
import io.fabric8.openshift.api.model.BuildList
import io.fabric8.openshift.api.model.ClusterPolicyBindingList
import io.fabric8.openshift.api.model.ClusterPolicyList
import io.fabric8.openshift.api.model.ClusterRoleBindingList
import io.fabric8.openshift.api.model.DeploymentConfigList
import io.fabric8.openshift.api.model.GroupList
import io.fabric8.openshift.api.model.IdentityList
import io.fabric8.openshift.api.model.ImageList
import io.fabric8.openshift.api.model.ImageStreamList
import io.fabric8.openshift.api.model.ImageStreamTagList
import io.fabric8.openshift.api.model.NamedTagEventList
import io.fabric8.openshift.api.model.OAuthAccessTokenList
import io.fabric8.openshift.api.model.OAuthAuthorizeTokenList
import io.fabric8.openshift.api.model.OAuthClientAuthorizationList
import io.fabric8.openshift.api.model.OAuthClientList
import io.fabric8.openshift.api.model.PolicyBindingList
import io.fabric8.openshift.api.model.PolicyList
import io.fabric8.openshift.api.model.ProjectList
import io.fabric8.openshift.api.model.RoleBindingList
import io.fabric8.openshift.api.model.RoleList
import io.fabric8.openshift.api.model.RouteList
import io.fabric8.openshift.api.model.SecurityContextConstraintsList
import io.fabric8.openshift.api.model.TemplateList
import io.fabric8.openshift.api.model.UserList
import kotlin.collections.List


fun BuildConfigList.`item`(block: io.fabric8.openshift.api.model.BuildConfig.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.BuildConfig()
  newObject.block()
  this.`items`.add(newObject)
}


fun BuildList.`item`(block: io.fabric8.openshift.api.model.Build.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.Build()
  newObject.block()
  this.`items`.add(newObject)
}


fun ClusterPolicyBindingList.`item`(block: io.fabric8.openshift.api.model.ClusterPolicyBinding.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.ClusterPolicyBinding()
  newObject.block()
  this.`items`.add(newObject)
}


fun ClusterPolicyList.`item`(block: io.fabric8.openshift.api.model.ClusterPolicy.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.ClusterPolicy()
  newObject.block()
  this.`items`.add(newObject)
}


fun ClusterRoleBindingList.`item`(block: io.fabric8.openshift.api.model.ClusterRoleBinding.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.ClusterRoleBinding()
  newObject.block()
  this.`items`.add(newObject)
}


fun DeploymentConfigList.`item`(block: io.fabric8.openshift.api.model.DeploymentConfig.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.DeploymentConfig()
  newObject.block()
  this.`items`.add(newObject)
}


fun GroupList.`item`(block: io.fabric8.openshift.api.model.Group.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.Group()
  newObject.block()
  this.`items`.add(newObject)
}


fun IdentityList.`item`(block: io.fabric8.openshift.api.model.Identity.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.Identity()
  newObject.block()
  this.`items`.add(newObject)
}


fun ImageList.`item`(block: io.fabric8.openshift.api.model.Image.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.Image()
  newObject.block()
  this.`items`.add(newObject)
}


fun ImageStreamList.`item`(block: io.fabric8.openshift.api.model.ImageStream.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.ImageStream()
  newObject.block()
  this.`items`.add(newObject)
}


fun ImageStreamTagList.`item`(block: io.fabric8.openshift.api.model.ImageStreamTag.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.ImageStreamTag()
  newObject.block()
  this.`items`.add(newObject)
}


fun NamedTagEventList.`item`(block: io.fabric8.openshift.api.model.TagEvent.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.TagEvent()
  newObject.block()
  this.`items`.add(newObject)
}


fun OAuthAccessTokenList.`item`(block: io.fabric8.openshift.api.model.OAuthAccessToken.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.OAuthAccessToken()
  newObject.block()
  this.`items`.add(newObject)
}


fun OAuthAuthorizeTokenList.`item`(block: io.fabric8.openshift.api.model.OAuthAuthorizeToken.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.OAuthAuthorizeToken()
  newObject.block()
  this.`items`.add(newObject)
}


fun OAuthClientAuthorizationList.`item`(block: io.fabric8.openshift.api.model.OAuthClientAuthorization.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.OAuthClientAuthorization()
  newObject.block()
  this.`items`.add(newObject)
}


fun OAuthClientList.`item`(block: io.fabric8.openshift.api.model.OAuthClient.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.OAuthClient()
  newObject.block()
  this.`items`.add(newObject)
}


fun PolicyBindingList.`item`(block: io.fabric8.openshift.api.model.PolicyBinding.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.PolicyBinding()
  newObject.block()
  this.`items`.add(newObject)
}


fun PolicyList.`item`(block: io.fabric8.openshift.api.model.Policy.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.Policy()
  newObject.block()
  this.`items`.add(newObject)
}


fun ProjectList.`item`(block: io.fabric8.openshift.api.model.Project.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.Project()
  newObject.block()
  this.`items`.add(newObject)
}


fun RoleBindingList.`item`(block: io.fabric8.openshift.api.model.RoleBinding.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.RoleBinding()
  newObject.block()
  this.`items`.add(newObject)
}


fun RoleList.`item`(block: io.fabric8.openshift.api.model.Role.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.Role()
  newObject.block()
  this.`items`.add(newObject)
}


fun RouteList.`item`(block: io.fabric8.openshift.api.model.Route.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.Route()
  newObject.block()
  this.`items`.add(newObject)
}


fun SecurityContextConstraintsList.`item`(block: io.fabric8.openshift.api.model.SecurityContextConstraints.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.SecurityContextConstraints()
  newObject.block()
  this.`items`.add(newObject)
}


fun TemplateList.`item`(block: io.fabric8.openshift.api.model.Template.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.Template()
  newObject.block()
  this.`items`.add(newObject)
}


fun UserList.`item`(block: io.fabric8.openshift.api.model.User.() -> Unit = {}) {
  val newObject = io.fabric8.openshift.api.model.User()
  newObject.block()
  this.`items`.add(newObject)
}

