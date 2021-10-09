plugins {
    id("java-library")
}


repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":log"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}