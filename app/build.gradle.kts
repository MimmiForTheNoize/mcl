plugins {
    application
}

group = "at.fh.mcl"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("at.fh.mlc")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":logA"))
    implementation(project(":logB"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}