plugins {
    id("lib-kotlin-android-no-config")
    id("publish-android")
}

dependencies {
    implementation(project(":bundle-data-api"))
}