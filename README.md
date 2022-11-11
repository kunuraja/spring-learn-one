# spring-learn-one
Spring core learning

Java configuration of stereotype components
=============================================

We can create java configuration for all stereo type components like @Service, @Primary, @Profile.

For this we can create a java class annotated with @Configuration and create methods for all beans (service class) which will return
instance of those classes. We need to annotate all those methods will **_@Ban_**

No need to annotate the services with @Service
