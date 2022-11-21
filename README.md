# spring-learn-one
Spring core learning

Spring External properties source
====================================

In order to pick the value from an ecternal source, we can create a properties file (datasource.properties
file here). 
Then we can create a model with all properties in .properties file (as in PropertiesDataSource).
Then we can create a config file by creating a Bean for the created model (PropertiesDataSource)
and can read the values of .properties file using **_@Value("${raj.user.username}")_**

We can use the annotation **_@PropertySource("classpath:datasource.properties")_** for spcifying the 
.properties file from where we can read the values

