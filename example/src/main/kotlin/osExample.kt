import com.fkorotkov.kubernetes.*
import com.fkorotkov.openshift.newDeploymentConfig
import com.fkorotkov.openshift.spec
import com.fkorotkov.openshift.template

fun main(args: Array<String>) {

  newDeploymentConfig {

    spec {
      template {
        spec {
          container {
            name = "some-name"
            image = "some-image"
            port {
              containerPort = 8080
              protocol = "TCP"
            }
            port {
              containerPort = 9090
              protocol = "UDP"
            }
            env {
              name = "some-env-var"
            }
            env {
              name = "some-other-name"
            }
          }

        }
      }

    }
  }.apply {
    println(this)
  }
}

