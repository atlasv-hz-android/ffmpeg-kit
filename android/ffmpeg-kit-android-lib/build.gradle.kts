plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.android.now.plugin.publishlib")
}
android {
    namespace = "com.arthenica.ffmpegkit"
    compileSdk = 35
    ndkVersion = "28.2.13676358"

    defaultConfig {
        minSdk = 24
        targetSdk = 35
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    sourceSets {
        getByName("main") {
            jniLibs.srcDirs(listOf("../libs"))
        }
    }
}

dependencies {
    api("com.arthenica:smart-exception-java:0.2.1")
    testImplementation("androidx.test.ext:junit:1.1.3")
    testImplementation("org.json:json:20220320")
}
