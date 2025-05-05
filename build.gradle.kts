import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.kotlinJvm) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.kotlinAndroid) apply false
    alias(libs.plugins.dokka) apply false
}


buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(libs.buildkonfig.gradle.plugin)
    }
}

subprojects {
    plugins.apply("org.jetbrains.dokka")
}


/*subprojects {
    apply(plugin = "org.jetbrains.dokka")
    *//*tasks.named("dokkaHtml").configure {
        outputDirectory.set(file("${layout.buildDirectory}/dokka"))
    }*//*
    *//*tasks.withType<DokkaTask>().configureEach {
        outputDirectory.set(layout.buildDirectory.dir("dokka/$name"))
    }*//*
}*/

// In root `build.gradle.kts`
/*tasks.register<org.jetbrains.dokka.gradle.DokkaMultiModuleTask>("dokkaForSomeModules") {
    outputDirectory.set(layout.buildDirectory.dir("dokka-custom"))

    // Only include desired subprojects
    addSubprojectChildTasks(
        project(":composeApp").tasks.named("dokkaHtml").get().toString(),
        //project(":moduleB").tasks.named("dokkaHtml").get()
    )
}*/




/*
subprojects {
    apply(plugin = "org.jetbrains.dokka")


    // DONE:8 Override dokkaHtml task and add custom output directory
    */
/*tasks.named("dokkaHtml") {
        // Add pluginsMapConfigurations for dokkaHtml, dokkaHtmlPartial
        plugins
        pluginsMapConfiguration.set(
            [
                "org.jetbrains.dokka.base.DokkaBase": """{
      "footerMessage": "$customFooterMessage",
      "customStyleSheets": ["$customLogoFile"]
     }"""
        ]
        )

        // Set suppressInheritedMembers to true in both the tasks
        suppressInheritedMembers.set(true)

    }*//*


    // dokkaHtmlPartial task and add external documentation in it and dokkaHtml both
    */
/*tasks.named("dokkaHtmlPartial") {
        // DONE:19 Add pluginsMapConfigurations for dokkaHtml, dokkaHtmlPartial
        pluginsMapConfiguration.set(
            [
                "org.jetbrains.dokka.base.DokkaBase": """{
      "footerMessage": "$customFooterMessage",
      "customStyleSheets": ["$customLogoFile"]
     }"""
        ]
        )

        // Set suppressInheritedMembers to true in both the tasks
        suppressInheritedMembers.set(true)

    }*//*

}

// Configure dokkaHtmlMultiModule task and add pluginsMapConfigurations in it
afterEvaluate {
   */
/* tasks.named("dokkaHtmlMultiModule") {
        pluginsMapConfiguration.set(
            [
                "org.jetbrains.dokka.base.DokkaBase": """{
          "footerMessage": "$customFooterMessage",
          "customStyleSheets": ["$customLogoFile"]
         }"""
        ]
        )
    }*//*

}

ext {
    // Get the current flavor of the build Ex: dev, stg, prod
    //var flavor = getCurrentFlavor()
    //println("flavour retrieved: $flavor")

    // Read the .properties for config
    //var configProperties = getProps(flavor + ".properties")

    //var localProperties = getProps("local.properties")

    var customFooterMessage = "Made with ❤️ at Yogaveda"
    var customLogoFile = projectDir.toString() + "/buildsystem/logo-style.css"

}*/
