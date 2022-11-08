# spring-learn-one
Spring core learning

Spring Profiles
================

2 Types of profiles:
    i. Active
    ii. Default

Suppose there are 2 implementation services with same service name. So in that case if we mention
@Qualifier at controller with the service name, it will be unable to qualify the bean it needs 
to call and will throw the following error "Annotation-specified bean name 'springProfile' for bean class
[com.raj.springlearnone.service.ProfileServiceTwoImpl] conflicts with existing"

We can resolve this conflict by adding @Profile annotation at the bean (service) and declaring the active 
profile in application.properties

We can make a bean as default profile by mentioning default in the profile. In that case if non of the 
profile has been declared as active in application.properties, it will pick the default one.
