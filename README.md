# spring-learn-one
Spring core learning

Spring profile application properties source
====================================

If we dont give **_@PropertySource("classpath:datasource.properties")_** annotation in the config class 
then by default properties will be picked from application.properties file.

Now in order to create profiles in application.properties file we need to add "-profileName"
in to application.properties file as
application-dev.properties
application-qa.properties

Then we need add the dev or qa profiles to spring.active.profiles= in application.properties

