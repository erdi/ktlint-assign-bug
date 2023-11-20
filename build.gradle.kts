plugins {
  `kotlin-dsl-base`
  id("org.jlleitschuh.gradle.ktlint") version("11.6.1")
}

repositories {
  mavenCentral()
}

ktlint {
  version = "0.49.1"
}
