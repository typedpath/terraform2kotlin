/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds
 */
 allprojects {
     repositories {

         jcenter()



     }
 }

 subprojects {
     version = "1.0.0"
     apply(plugin = "java")
 }

project(":terraform2kotlin") {
    dependencies {
        "implementation"(project(":testlambdas:hellolambda"))
    }

}




 