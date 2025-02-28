plugins {

    id("kotlin-kapt")

    id("com.google.dagger.hilt.android")
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("androidx.navigation.safeargs.kotlin")
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
        viewBinding =true
        dataBinding =true
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Hilt Dependency Injection
    implementation("com.google.dagger:hilt-android:2.51")
    kapt("com.google.dagger:hilt-android-compiler:2.51")

    // Jetpack Navigation Component
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.7")

    // Coordinator Layout
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0")

    // Material Components (Latest Stable)
    implementation("com.google.android.material:material:1.11.0")

    // Navigation Component (Latest Stable)
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.7")

    // Room components (Latest Stable)
    implementation("androidx.room:room-runtime:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    androidTestImplementation("androidx.room:room-testing:2.6.1")

    // DataStore (Latest Stable)
    implementation("androidx.datastore:datastore-preferences:1.1.0")

    // RecyclerView
    implementation("androidx.recyclerview:recyclerview:1.3.2")

    // Retrofit (Latest Stable)
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Dagger Hilt (Latest Stable)
    implementation("com.google.dagger:hilt-android:2.51")
    kapt("com.google.dagger:hilt-android-compiler:2.51")

    // AndroidX Hilt ViewModel (Deprecated: Use Hilt directly)
    // implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03") // REMOVE
    kapt("androidx.hilt:hilt-compiler:1.1.0")

    // Kotlin Coroutines (Latest Stable)
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // Lifecycle (Latest Stable)
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")

    // Image Loading (Coil Latest Stable)
    implementation("io.coil-kt.coil3:coil-compose:3.1.0")
    implementation("io.coil-kt.coil3:coil-network-okhttp:3.1.0")

    // Gson (Latest Stable)
    implementation("com.google.code.gson:gson:2.10.1")

    // Shimmer (Facebook Shimmer)
    implementation("com.facebook.shimmer:shimmer:0.5.0")
//    implementation ("com.github.sharish:ShimmerRecyclerView:v1.3")
    // Jsoup (Latest Stable)
    implementation("org.jsoup:jsoup:1.17.2")
// Enable Hilt annotation processing


}
kapt {
    correctErrorTypes = true
}