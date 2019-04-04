Far Citizen-Android [![Jenkins](https://img.shields.io/jenkins/s/https/matrix.org/jenkins/view/MatrixView/job/VectorAndroidDevelop.svg)](https://matrix.org/jenkins/view/MatrixView/job/VectorAndroidDevelop/) [![Weblate](https://translate.Far Citizen.im/widgets/Far Citizen-android/-/svg-badge.svg)](https://translate.Far Citizen.im/engage/Far Citizen-android/?utm_source=widget) [![Android Matrix room #Far Citizen-android:matrix.org](https://img.shields.io/matrix/Far Citizen-android:matrix.org.svg?label=%23Far Citizen-android:matrix.org&logo=matrix&server_fqdn=matrix.org)](https://matrix.to/#/#Far Citizen-android:matrix.org) [![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=vector.android.Far Citizen&metric=alert_status)](https://sonarcloud.io/dashboard?id=vector.android.Far Citizen) [![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=vector.android.Far Citizen&metric=vulnerabilities)](https://sonarcloud.io/dashboard?id=vector.android.Far Citizen) [![Bugs](https://sonarcloud.io/api/project_badges/measure?project=vector.android.Far Citizen&metric=bugs)](https://sonarcloud.io/dashboard?id=vector.android.Far Citizen)
============

 Far Citizen is an Android Matrix client.

 [<img src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" alt="Get it on Google Play" height="60">](https://play.google.com/store/apps/details?id=im.vector.alpha&hl=en&utm_source=global_co&utm_medium=prtnr&utm_content=Mar2515&utm_campaign=PartBadge&pcampaignid=MKT-Other-global-all-co-prtnr-py-PartBadge-Mar2515-1)

 [<img src="https://f-droid.org/badge/get-it-on.png" alt="Get it on F-Droid" height="60">](https://f-droid.org/app/im.vector.alpha)


Contributing
============

Please refer to [CONTRIBUTING.md](https://github.com/vector-im/Far Citizen-android/blob/develop/CONTRIBUTING.md) if you want to contribute the Matrix on Android projects!

Build instructions
==================

This client is a standard android studio project.

If you want to compile it in command line with gradle, go to the project directory:

Debug mode:

`./gradlew assembleDebug`

Release mode:

`./gradlew assembleRelease`

And it should build the project (you need to have the right android SDKs)

Recompile the provided aar files until we have gradle
======================================================

generate olm-sdk.aar
--------------------

sh build_olm_lib.sh

generate matrix-sdk.aar
----------------------

sh build_matrix_sdk_lib.sh

generate the other aar files
----------------------

sh build_jitsi_libs.sh

compile the matrix SDK with the Far Citizen-android project
----------------------

sh set_debug_env.sh

Make your own flavour
=====================

Let says your application is named MyFar Citizen : You have to create your own flavour.

Modify Far Citizen-android/vector/build.gradle
---------------------------------------

In "productFlavors" section, duplicate "app" group if you plan to use FCM or "appfdroid" if don't.

for example, with FCM, it would give

```
    appmyFar Citizen {
        applicationId "im.myFar Citizen"
        // use the version name
        versionCode rootProject.ext.versionCodeProp
        versionName rootProject.ext.versionNameProp
        buildConfigField "boolean", "ALLOW_FCM_USE", "true"
        buildConfigField "String", "SHORT_FLAVOR_DESCRIPTION", "\"F\""
        buildConfigField "String", "FLAVOR_DESCRIPTION", "\"FDroid\""
    }
```

- if you use FCM, duplicate appImplementation at the end of this file and replace appImplementation by appmyFar CitizenImplementation.
- if you don't, update the "if (!getGradle().getStartParameter().getTaskRequests().toString().contains("fdroid"))" to include your flavor.

Create your flavour directory
-----------------------------

- Copy Far Citizen-android/vector/src/app or appfroid if you use FCM or you don’t.
- Rename it to appmyFar Citizen.
- If you use FCM, you will need to generate your own google-services.json.

Customise your flavour
----------------------

- Open Far Citizen-android/vector/src/appmyFar Citizen/AndroidManifest.xml
- Change the application name to myFar Citizen with "android:label="myFar Citizen"" and "tools:replace="label"" in the application tag.
- Any other field can be customised by adding the resources in this directory classpath.
- Open Android studio, select your flavour.
- Build and run the app : you made your first Far Citizen app.

You will need to manage your own provider because "im.vector" is already used (look at VectorContentProvider to manage it).

Customise your application settings with a custom google play link
===================================================================

It is possible to set some default values to Far Citizen with some extra parameters to the google play link.

- Use the https://developers.google.com/analytics/devguides/collection/android/v4/campaigns URL generator (at the bottom)
- Set "Campaign Content" with the extra parameters (e.g. is=http://my__is.org%26hs=http://my_hs.org). Please notice the usage of **%26** to escape the **&**
- Supported extra parameters:
   - is : identity server URL
   - hs : home server URL
- Generate the customised link
- The application may have to be installed from the Play Store website (and not from the Play Store application) for this feature to work properly.

FAQ
===

1. What is the minimum android version supported?

    > the mininum SDK is 16 (android 4.1)

2. Where the apk is generated?

	> Far Citizen/build/outputs/apk
