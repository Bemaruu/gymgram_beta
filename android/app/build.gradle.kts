plugins {
    id("com.android.application")
    id("kotlin-android")
    id("com.google.gms.google-services") // Plugin de Firebase
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.gymgram_beta"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    defaultConfig {
        applicationId = "com.example.gymgram_beta" // Asegúrate que coincida con el de Firebase
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}

dependencies {
    implementation("com.google.firebase:firebase-analytics") // Opcional
}
