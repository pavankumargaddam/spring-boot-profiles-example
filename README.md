# spring-boot-profiles-example

# We require different configuration based on the environment.

For dev profile, you need to crate "application-dev.properties", so whatever you put in application-dev.properties, it will override properties from application.properties.
Suppose you need to start qa profile at port “8081”, you can put following entry in application in “application-qa.properties”.

# Setting active profile

When you run spring boot application, you need to set active profile. There are multiple ways to set active profile.

# 1) In VM Arguments

Syntax : 
-Dspring.profiles.active=<<profile_name>>

Example:
-Dspring.profiles.active=dev

# 2) In application.properties

Syntax:
spring.profiles.active=<<profile_name>>,<<profile_name2>>

Example:
spring.profiles.active=dev,prod




