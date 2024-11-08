plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "tj.ikrom.core.navigation"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    // For the components to work, you need to add this code to the builds
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(project(":core:common"))

    implementation(libs.ui)
    implementation(libs.core.ktx)
    implementation(libs.compose.runtime)
    implementation(libs.material)
    implementation(libs.material3)
    implementation(libs.navigation.compose)
    implementation(libs.ui.tooling)
    implementation(libs.ui.graphics)
    implementation(libs.activity.compose)
    implementation(libs.material.compose)
    implementation(libs.ui.preview)
    implementation(libs.lifecycle.ktx)
    implementation(platform(libs.compose.bom))

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.espresso.core)
}