// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.3.15") // Plugin Google Services
    }
}

plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.google.gms.google-services") version "4.3.15" apply false
    id("dev.flutter.flutter-gradle-plugin") version "1.0.0" apply false
}
