plugins {
    id("com.android.application")  // Removed version and apply false; version managed in root
    id("org.jetbrains.kotlin.android")  // Same as above
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")  // Same as above
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.jahid.foodreceipe"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.jahid.foodreceipe"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
        // Optional: compose = true  // Uncomment if using Jetpack Compose
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {  // Added debug configuration
            isDebuggable = true
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)  // Updated to 1.12.0 from libs.versions.toml
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.android.compiler)

    // Navigation
    implementation("androidx.navigation:navigation-fragment-ktx:2.8.9")  // Matches libs.versions.toml
    implementation("androidx.navigation:navigation-ui-ktx:2.8.9")

    // Coordinator Layout
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0")

    // Room
    implementation("androidx.room:room-runtime:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    androidTestImplementation("androidx.room:room-testing:2.6.1")

    // DataStore
    implementation("androidx.datastore:datastore-preferences:1.1.0")

    // RecyclerView
    implementation("androidx.recyclerview:recyclerview:1.3.2")

    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)

    // Kotlin Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // Lifecycle
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")

    // Coil
    implementation(libs.coil.compose)  // Updated to 3.1.0 from libs.versions.toml
    implementation(libs.coil.network.okhttp)  // Matches coilCompose version

    // Gson
    implementation(libs.gson)

    // Shimmer
    implementation(libs.shimmer)

    // Jsoup
    implementation(libs.jsoup)
}

kapt {
    correctErrorTypes = true
}