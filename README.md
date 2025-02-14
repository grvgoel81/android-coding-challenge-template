# Android Coding Challenge Template

Ready to kick off your next Android project?
This template will get you started as quick as possible with a lot of interesting features, so you can focus directly on your application.

## Features 🎨

- **100% Kotlin-only template**. :heavy_check_mark: 
- Jetpack Compose setup ready to use. :heavy_check_mark:
- Dagger Hilt, Retrofit, OkHttp, Room
- Sample Espresso, Instrumentation & JUnit tests. :heavy_check_mark:
- 100% Gradle Kotlin DSL setup. :heavy_check_mark:
- CI Setup with GitHub Actions. :heavy_check_mark:
- Dependency versions managed via `buildSrc`. :heavy_check_mark:
- Kotlin Static Analysis via `detekt` and `ktlint`. :heavy_check_mark:
- Issues Template (bug report + feature request). :heavy_check_mark:
- Pull Request Template. :heavy_check_mark:

## Gradle Setup 🐘

This template is using [**Gradle Kotlin DSL**](https://docs.gradle.org/current/userguide/kotlin_dsl.html) as well as the [Plugin DSL](https://docs.gradle.org/current/userguide/plugins.html#sec:plugins_block) to setup the build.

Dependencies are centralized inside the Gradle Version Catalog in the [libs.versions.toml](gradle/libs.versions.toml) file in the `gradle` folder.

## Static Analysis 🔍

This template is using [**detekt**](https://github.com/detekt/detekt) to analyze the source code, with the configuration that is stored in the [detekt.yml](config/detekt/detekt.yml) file (the file has been generated with the `detektGenerateConfig` task). It also uses the **detekt-formatting** plugin which includes the ktlint rules (see https://detekt.dev/docs/rules/formatting/).

## CI ⚙️

This template is using [**GitHub Actions**](https://github.com/cortinico/kotlin-android-template/actions) as CI. You don't need to setup any external service and you should have a running CI once you start using this template.

There are currently the following workflows available:
- [Validate Gradle Wrapper](.github/workflows/gradle-wrapper-validation.yml) - Will check that the gradle wrapper has a valid checksum
- [Pre Merge Checks](.github/workflows/pre-merge.yaml) - Will run the `build`, `check` tasks.

## Project Structure

- **`app`:** The source for the final Android application.

The following additional top-level directories configure & support building the app & projects:

- **`buildSrc`:** Contains shared Gradle logic as [precompiled script plugins](https://docs.gradle.org/current/userguide/custom_plugins.html#sec:precompiled_plugins)
- **`config`:** Contains the [Detekt configuration file](https://detekt.dev/docs/introduction/configurations/).
- **`gradle`:** Contains Gradle Configuration files such as the Gradle Version Catalog and the [Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html).

Finally, the following hidden top-level directories provide functionality for specific development systems:

- **`.github`:** Defines the [Github Actions](https://github.com/features/actions) CI tasks and templates for new pull requests, issues, etc.
- **`.idea`:** Sets common initial project settings when the project is opened in [Android Studio](https://developer.android.com/studio) or [IntelliJ IDEA](https://www.jetbrains.com/idea/).

## Contributing 🤝

Feel free to open a issue or submit a pull request for any bugs/improvements.
