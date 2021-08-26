# Introduction

This is a minimal project to reproduce [IDEA-274284](https://youtrack.jetbrains.com/issue/IDEA-274284).

# Requirements

* Java (any fairly recent version should do)
* Maven

# Steps to reproduce

1. Install `sample-processor` to your local Maven repository
   1. `cd sample-processor`
   1. `mvn clean install`
1. Open `sample-project` in IntelliJ IDEA
1. Hit `Build` -> `Rebuild project`

# What happens

In Intellij IDEA up to including 2021.1.3 the project builds correctly. The same is true when using `mvn` from IntelliJ
IDEA's built-in Terminal on any IntelliJ IDEA version (including 2021.2).

However, building using IntelliJ IDEA's `Build` menu item (or any other means of building the project from within IDEA)
in IntelliJ IDEA 2021.2 the build fails with:

`java: org.apache.velocity.exception.VelocityException: The specified class for ResourceManager (org.apache.velocity.runtime.resource.ResourceManagerImpl) does not implement org.apache.velocity.runtime.resource.ResourceManager; Velocity is not initialized correctly.`
