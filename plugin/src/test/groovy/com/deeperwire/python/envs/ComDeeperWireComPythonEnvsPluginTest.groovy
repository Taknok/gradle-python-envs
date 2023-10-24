/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package com.deeperwire.python.envs

import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import spock.lang.Specification

/**
 * A simple unit test for the 'com.deeperwire.python.envs.greeting' plugin.
 */
class PythonEnvsPluginTest extends Specification {
    def "plugin registers task"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.plugins.apply("com.deeperwire.python.envs.greeting")

        then:
        project.tasks.findByName("greeting") != null
    }
}
