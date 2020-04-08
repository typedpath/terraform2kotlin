
plugins {
    java
    maven
    "kotlin"
    "io.spring.dependency-management"
}

group = "com.typedpath.testlambdas"
version = "testonly"

description = """hello"""

val sourceCompatibility = 1.5
val targetCompatibility = 1.5
 tasks.withType<JavaCompile>().configureEach {
  options.encoding = "UTF-8"
}

buildscript {
  repositories {
    mavenCentral()
    maven { url = uri("https://plugins.gradle.org/m2/") }
  }
  dependencies {
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50")
    classpath ("io.spring.gradle:dependency-management-plugin:1.0.3.RELEASE")
  }
}


repositories {
  maven { url =uri("http://repo.maven.apache.org/maven2") }
}


dependencies {
  compile("org.jetbrains.kotlin:kotlin-stdlib:1.3.50")

  compile("com.amazonaws:aws-lambda-java-core:1.1.0")
  compile ("com.amazonaws:aws-java-sdk-s3:1.11.574")
  compile("com.amazonaws:aws-lambda-java-events:2.0.1")

    compile( "org.jetbrains.kotlin:kotlin-reflect")
    testCompile( "org.jetbrains.kotlin:kotlin-reflect")

}

apply {
    plugin("java")
    plugin("maven")
    plugin("idea")
    plugin("kotlin")
}

val fatJar = task("fatJar", type = Jar::class) {
    baseName = "${project.name}-fat"
    //exclude("**/amazonaws/**/*.class")
    from(configurations.runtimeClasspath.get()
            .map({
                println(it)
       if (it.isDirectory) it else zipTree(it) }))
    with(tasks["jar"] as CopySpec)
}

tasks {
    "build" {
        dependsOn(fatJar)
    }
}
 



