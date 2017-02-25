/**
 * Created by rudi on 25/02/2017.
 */
package nl.hollannikas

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class TodoApplication

fun main(args: Array<String>) {
    SpringApplication.run(TodoApplication::class.java, *args)
}

@RestController
class ToDoController () {

    @GetMapping("/")
    fun findAll() = "Hello"
}