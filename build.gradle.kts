// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
//    id("com.android.application") version "8.8.0" apply false
    id("com.android.library") version "8.8.0" apply false
//    id("org.jetbrains.kotlin.android") version "2.1.10" apply false
    id("androidx.navigation.safeargs.kotlin") version "2.7.7" apply false
    id("com.google.dagger.hilt.android") version "2.51" apply false

}