plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "tj.ikrom.guidetj"
    compileSdk = 35

    defaultConfig {
        applicationId = "tj.ikrom.guidetj"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_19
        targetCompatibility = JavaVersion.VERSION_19
    }
    kotlinOptions {
        jvmTarget = "19"
    }
    buildFeatures {
        compose = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(":core:common"))
    implementation(project(":feature:components"))

    implementation(libs.ui)
    implementation(libs.core.ktx)
    implementation(libs.material)
    implementation(libs.material3)
    implementation(libs.appcompat)
    implementation(libs.ui.preview)
    implementation(libs.ui.tooling)
    implementation(libs.ui.graphics)
    implementation(libs.lifecycle.ktx)
    implementation(libs.compose.runtime)
    implementation(libs.activity.compose)
    implementation(libs.material.compose)
    implementation(libs.navigation.compose)
    implementation(platform(libs.compose.bom))

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.espresso.core)
}