# spring-learn-one
Spring core learning

Primary Bean
==============

@Primary annotation is used to make the bean primary. Suppose there is conflicts in the bean and we are not using @Qualifier annotation, then the bean annotated 
with @Primary will be called by default.

And we will get the error "Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans,
or using @Qualifier to identify the bean that should be consumed"
