package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.IntOrString
import org.junit.Test
import kotlin.test.assertEquals

class SimpleCompilationTest {
  @Test
  fun testService() {
    val serviceName = "test"
    val myService = newService {
      metadata {
        name = serviceName
        labels = mapOf(
            "app" to serviceName,
            "tier" to "backend"
        )
      }
      spec {
        type = "NodePort"

        port {
          name = "http"
          port = 8080
          targetPort = IntOrString(8080)
        }
        port {
          name = "grcp"
          port = 8239
          targetPort = IntOrString(8239)
        }

        selector = mapOf(
            "app" to serviceName,
            "tier" to "backend"
        )
      }
    }
    assertEquals(serviceName, myService.metadata.name)
    assertEquals("NodePort", myService.spec.type)
    assertEquals(2, myService.spec.ports.size)

    myService.apply {
      metadata {
        name = "foo"
      }
    }
    assertEquals("foo", myService.metadata.name)
  }
}