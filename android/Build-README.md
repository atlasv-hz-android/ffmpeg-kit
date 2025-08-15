## 发布aar

* 进入到android/ffmpeg-kit-android-lib

查看任务
```sh
./gradlew tasks
Publishing tasks
----------------
generateMetadataFileForReleasePublication - Generates the Gradle metadata file for publication 'release'.
generatePomFileForReleasePublication - Generates the Maven POM file for publication 'release'.
publish - Publishes all publications produced by this project.
publishAllPublicationsToGitHubPackagesRepository - Publishes all Maven publications produced by this project to the GitHubPackages repository.
publishReleasePublicationToGitHubPackagesRepository - Publishes Maven publication 'release' to Maven repository 'GitHubPackages'.
publishReleasePublicationToMavenLocal - Publishes Maven publication 'release' to the local Maven repository.
publishToMavenLocal - Publishes all Maven publications produced by this project to the local Maven cache.
```

```sh
./gradlew publishReleasePublicationToGitHubPackagesRepository
```

```sh
./gradlew publishReleasePublicationToMavenLocal
```