package org.springframework.samples.petclinic

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(proxyBeanMethods = false)
class PetClinicApplication

fun bbb() {
    println("---------")
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    for (i in numbers) {
        println("number = $i")
    }
    println("---------")
    val strings = listOf("a", "b", "c", "d", "e")
    for (s in strings) {
        println("string = $s")
    }
    println("----------")
}


fun aaa() {
    println("---------")
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    for (i in numbers) {
        println("number = $i")
    }
    println("---------")
    val strings = listOf("a", "b", "c", "d", "e")
    for (s in strings) {
        println("string = $s")
    }
    println("----------")
}
