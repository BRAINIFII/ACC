const val kotlinVersion = "1.3.70"
const val navigationVersion = "2.2.1"


object BuildPlugins {

    object Versions {
        const val gradleBuildToolsVersion = "4.0.0-beta02"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.gradleBuildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val navigationSafeArgsGradlePlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:$navigationVersion"

    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val kotlinKapt = "kotlin-kapt"
    const val navigationSafeArgs  = "androidx.navigation.safeargs.kotlin"

}

object AndroidSdk {
    const val min = 26
    const val compile = 29
    const val target = 29
}

object Libraries {
    private object Versions {
        const val jetpack = "1.1.0"
        const val constraintLayout = "2.0.0-beta4"
        const val core = "1.2.0"
        const val preference = "1.1.0"
        const val palette = "1.0.0"
        const val room = "2.2.4"
        const val lifecycle = "2.2.0"
        const val coroutines = "1.3.3"
        const val fragment = "1.2.2"
        const val material = "1.2.0-alpha05"
        const val libSu = "2.5.1"
        const val chroma = "1.2.6"
        const val bouncycastle = "1.64"
        const val assent = "3.0.0-RC4"
        const val about = "2.4.2"
        const val appUpdater = "2.7"
        const val whatTheStack = "0.0.1"
    }

    const val kotlinStdLib        = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val appCompat           = "androidx.appcompat:appcompat:${Versions.jetpack}"
    const val constraintLayout    = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore             = "androidx.core:core-ktx:${Versions.core}"
    const val ktxFragment         = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val KtxPreference       = "androidx.preference:preference-ktx:${Versions.preference}"
    const val KtxPalette          = "androidx.palette:palette-ktx:${Versions.palette}"

    const val roomRuntime         = "androidx.room:room-runtime:${Versions.room}"
    const val roomKtx             = "androidx.room:room-ktx:${Versions.room}"
    const val roomCompiler        = "androidx.room:room-compiler:${Versions.room}"

    const val lifecycleCommon     = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"
    const val lifecycleLiveData   = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycleViewModel  = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"

    const val coroutines          = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    const val navigationFragment  = "androidx.navigation:navigation-fragment-ktx:${navigationVersion}"
    const val navigationUI        = "androidx.navigation:navigation-ui-ktx:${navigationVersion}"

    const val materialComponents  = "com.google.android.material:material:${Versions.material}"

    const val libSu               = "com.github.topjohnwu.libsu:core:${Versions.libSu}"

    const val lawnchairChroma     = "com.github.LawnchairLauncher:chroma:${Versions.chroma}"

    const val bcProv              = "org.bouncycastle:bcprov-jdk15on:${Versions.bouncycastle}"
    const val bcPkix              = "org.bouncycastle:bcpkix-jdk15on:${Versions.bouncycastle}"

    const val assentCore          = "com.afollestad.assent:core:${Versions.assent}"
    const val assentRationales    = "com.afollestad.assent:rationales:${Versions.assent}"

    const val materialAbout       = "com.github.daniel-stoneuk:material-about-library:${Versions.about}"

    const val appUpdater          = "com.github.javiersantos:AppUpdater:${Versions.appUpdater}"

    const val whatTheStack        = "com.github.haroldadmin:WhatTheStack:${Versions.whatTheStack}"
}