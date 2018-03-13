// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.ComponentStatusList
import io.fabric8.kubernetes.api.model.ConfigMapList
import io.fabric8.kubernetes.api.model.ConfigMapProjection
import io.fabric8.kubernetes.api.model.ConfigMapVolumeSource
import io.fabric8.kubernetes.api.model.CronJobList
import io.fabric8.kubernetes.api.model.DownwardAPIProjection
import io.fabric8.kubernetes.api.model.DownwardAPIVolumeSource
import io.fabric8.kubernetes.api.model.EndpointsList
import io.fabric8.kubernetes.api.model.EventList
import io.fabric8.kubernetes.api.model.HorizontalPodAutoscalerList
import io.fabric8.kubernetes.api.model.JobList
import io.fabric8.kubernetes.api.model.LimitRangeList
import io.fabric8.kubernetes.api.model.NamespaceList
import io.fabric8.kubernetes.api.model.NodeList
import io.fabric8.kubernetes.api.model.PersistentVolumeClaimList
import io.fabric8.kubernetes.api.model.PersistentVolumeList
import io.fabric8.kubernetes.api.model.PodList
import io.fabric8.kubernetes.api.model.PodTemplateList
import io.fabric8.kubernetes.api.model.ReplicationControllerList
import io.fabric8.kubernetes.api.model.ResourceQuotaList
import io.fabric8.kubernetes.api.model.SecretList
import io.fabric8.kubernetes.api.model.SecretProjection
import io.fabric8.kubernetes.api.model.SecretVolumeSource
import io.fabric8.kubernetes.api.model.ServiceAccountList
import io.fabric8.kubernetes.api.model.ServiceList
import io.fabric8.kubernetes.api.model.StorageClassList
import io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinitionList
import io.fabric8.kubernetes.api.model.extensions.DaemonSetList
import io.fabric8.kubernetes.api.model.extensions.DeploymentList
import io.fabric8.kubernetes.api.model.extensions.IngressList
import io.fabric8.kubernetes.api.model.extensions.NetworkPolicyList
import io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicyList
import io.fabric8.kubernetes.api.model.extensions.ReplicaSetList
import io.fabric8.kubernetes.api.model.extensions.StatefulSetList
import io.fabric8.kubernetes.api.model.extensions.ThirdPartyResourceList
import io.fabric8.kubernetes.api.model.policy.PodDisruptionBudgetList
import kotlin.collections.List


fun ComponentStatusList.`item`(block: io.fabric8.kubernetes.api.model.ComponentStatus.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.ComponentStatus()
  newObject.block()
  this.`items`.add(newObject)
}


fun ConfigMapList.`item`(block: io.fabric8.kubernetes.api.model.ConfigMap.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.ConfigMap()
  newObject.block()
  this.`items`.add(newObject)
}


fun ConfigMapProjection.`item`(block: io.fabric8.kubernetes.api.model.KeyToPath.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.KeyToPath()
  newObject.block()
  this.`items`.add(newObject)
}


fun ConfigMapVolumeSource.`item`(block: io.fabric8.kubernetes.api.model.KeyToPath.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.KeyToPath()
  newObject.block()
  this.`items`.add(newObject)
}


fun CronJobList.`item`(block: io.fabric8.kubernetes.api.model.CronJob.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.CronJob()
  newObject.block()
  this.`items`.add(newObject)
}


fun CustomResourceDefinitionList.`item`(block: io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.apiextensions.CustomResourceDefinition()
  newObject.block()
  this.`items`.add(newObject)
}


fun DaemonSetList.`item`(block: io.fabric8.kubernetes.api.model.extensions.DaemonSet.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.DaemonSet()
  newObject.block()
  this.`items`.add(newObject)
}


fun DeploymentList.`item`(block: io.fabric8.kubernetes.api.model.extensions.Deployment.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.Deployment()
  newObject.block()
  this.`items`.add(newObject)
}


fun DownwardAPIProjection.`item`(block: io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile()
  newObject.block()
  this.`items`.add(newObject)
}


fun DownwardAPIVolumeSource.`item`(block: io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.DownwardAPIVolumeFile()
  newObject.block()
  this.`items`.add(newObject)
}


fun EndpointsList.`item`(block: io.fabric8.kubernetes.api.model.Endpoints.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.Endpoints()
  newObject.block()
  this.`items`.add(newObject)
}


fun EventList.`item`(block: io.fabric8.kubernetes.api.model.Event.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.Event()
  newObject.block()
  this.`items`.add(newObject)
}


fun HorizontalPodAutoscalerList.`item`(block: io.fabric8.kubernetes.api.model.HorizontalPodAutoscaler.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.HorizontalPodAutoscaler()
  newObject.block()
  this.`items`.add(newObject)
}


fun IngressList.`item`(block: io.fabric8.kubernetes.api.model.extensions.Ingress.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.Ingress()
  newObject.block()
  this.`items`.add(newObject)
}


fun JobList.`item`(block: io.fabric8.kubernetes.api.model.Job.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.Job()
  newObject.block()
  this.`items`.add(newObject)
}


fun LimitRangeList.`item`(block: io.fabric8.kubernetes.api.model.LimitRange.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.LimitRange()
  newObject.block()
  this.`items`.add(newObject)
}


fun NamespaceList.`item`(block: io.fabric8.kubernetes.api.model.Namespace.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.Namespace()
  newObject.block()
  this.`items`.add(newObject)
}


fun NetworkPolicyList.`item`(block: io.fabric8.kubernetes.api.model.extensions.NetworkPolicy.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.NetworkPolicy()
  newObject.block()
  this.`items`.add(newObject)
}


fun NodeList.`item`(block: io.fabric8.kubernetes.api.model.Node.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.Node()
  newObject.block()
  this.`items`.add(newObject)
}


fun PersistentVolumeClaimList.`item`(block: io.fabric8.kubernetes.api.model.PersistentVolumeClaim.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.PersistentVolumeClaim()
  newObject.block()
  this.`items`.add(newObject)
}


fun PersistentVolumeList.`item`(block: io.fabric8.kubernetes.api.model.PersistentVolume.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.PersistentVolume()
  newObject.block()
  this.`items`.add(newObject)
}


fun PodDisruptionBudgetList.`item`(block: io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.policy.PodDisruptionBudget()
  newObject.block()
  this.`items`.add(newObject)
}


fun PodList.`item`(block: io.fabric8.kubernetes.api.model.Pod.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.Pod()
  newObject.block()
  this.`items`.add(newObject)
}


fun PodSecurityPolicyList.`item`(block: io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.PodSecurityPolicy()
  newObject.block()
  this.`items`.add(newObject)
}


fun PodTemplateList.`item`(block: io.fabric8.kubernetes.api.model.PodTemplate.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.PodTemplate()
  newObject.block()
  this.`items`.add(newObject)
}


fun ReplicaSetList.`item`(block: io.fabric8.kubernetes.api.model.extensions.ReplicaSet.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.ReplicaSet()
  newObject.block()
  this.`items`.add(newObject)
}


fun ReplicationControllerList.`item`(block: io.fabric8.kubernetes.api.model.ReplicationController.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.ReplicationController()
  newObject.block()
  this.`items`.add(newObject)
}


fun ResourceQuotaList.`item`(block: io.fabric8.kubernetes.api.model.ResourceQuota.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.ResourceQuota()
  newObject.block()
  this.`items`.add(newObject)
}


fun SecretList.`item`(block: io.fabric8.kubernetes.api.model.Secret.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.Secret()
  newObject.block()
  this.`items`.add(newObject)
}


fun SecretProjection.`item`(block: io.fabric8.kubernetes.api.model.KeyToPath.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.KeyToPath()
  newObject.block()
  this.`items`.add(newObject)
}


fun SecretVolumeSource.`item`(block: io.fabric8.kubernetes.api.model.KeyToPath.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.KeyToPath()
  newObject.block()
  this.`items`.add(newObject)
}


fun ServiceAccountList.`item`(block: io.fabric8.kubernetes.api.model.ServiceAccount.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.ServiceAccount()
  newObject.block()
  this.`items`.add(newObject)
}


fun ServiceList.`item`(block: io.fabric8.kubernetes.api.model.Service.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.Service()
  newObject.block()
  this.`items`.add(newObject)
}


fun StatefulSetList.`item`(block: io.fabric8.kubernetes.api.model.extensions.StatefulSet.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.StatefulSet()
  newObject.block()
  this.`items`.add(newObject)
}


fun StorageClassList.`item`(block: io.fabric8.kubernetes.api.model.StorageClass.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.StorageClass()
  newObject.block()
  this.`items`.add(newObject)
}


fun ThirdPartyResourceList.`item`(block: io.fabric8.kubernetes.api.model.extensions.ThirdPartyResource.() -> Unit = {}) {
  val newObject = io.fabric8.kubernetes.api.model.extensions.ThirdPartyResource()
  newObject.block()
  this.`items`.add(newObject)
}

