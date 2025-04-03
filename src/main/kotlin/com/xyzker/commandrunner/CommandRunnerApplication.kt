package com.xyzker.commandrunner

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CommandRunnerApplication : CommandLineRunner {

    override fun run(vararg args: String?) {
        println("Hello World")
    }

}

fun main(args: Array<String>) {
    runApplication<CommandRunnerApplication>(*args)
}
