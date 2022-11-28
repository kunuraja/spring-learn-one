# spring-learn-one
Spring core learning

Reading yaml files to bind constructor config
======================================================

We can bind constructor config with external .yaml data. 

For this we need to create one constructor config class (here SpringContructorConfig). Annotate the class with **_@ConstructorBinding and @ConfigurationProperties("raj.user")_**
Ceate constructor for all the fields and only getters for all fields.

In SpringConfig class create a bean returning instance of the datasource and pass  SpringContructorConfig as parameter in the 
method. Use the instance of SpringContructorConfig to get all the properties. Add the annotations **_@Configuration and 
@EnableConfigurationProperties(SpringConstructorConfig.class)_** at class level.

By default it will read the properties of application.yaml. But we can make active profiles (dev or qa here) by creating application-dev.yaml or application-qa.yaml respectively

