// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false

}

buildscript{
    dependencies{
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.57.1")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.9.5")
    }
}