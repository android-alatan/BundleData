[![Main Commit](https://github.com/android-alatan/BundleData/actions/workflows/lib-main-branch.yml/badge.svg?branch=main)](https://github.com/android-alatan/BundleData/actions/workflows/lib-main-branch.yml)
[![Release](https://jitpack.io/v/android-alatan/bundledata.svg)](https://jitpack.io/#android-alatan/bundledata)
# BundleData

This repo is internal usage for other : android-alatan/BroadcastReceiver , android-alatan/LifecycleComponents

Generally you will meet only assertion package.

### Installation
```kotlin
implementation("com.github.android-alatan.bundledata:bundle-data-api:$version")
implementation("com.github.android-alatan.bundledata:bundle-data:$version")

testImplementation("com.github.android-alatan.bundledata:bundle-data-assertion:$version")
```

### Example
```kotlin
// build.gradle
testImplementation("com.github.android-alatan.bundledata:bundle-data-assertion:$version")

// test code
class FooTest {
  @Test
  fun test() {
      val mapData = MapIntentData(mutableMapOf())
      mapData.newMapData(mutableMapOf("key" to "value"))
      mapData.setUriString("data-uri")
      mapData.setType("new-type")
  }
}
```