# spring-learn-one
Spring core learning

Component Scan
==============
By default Spring will scan the components in the package where main application resides.

Now suppose we have placed our services in a different package where main application is not located.
Then in that case it will throw following error "Field myService in com.raj.springlearnone.controller.
MyController required a bean of type 'raj.component.scan.MyService' that could not be found"

In order to resolve the error we can use the annotation in the main class.
    **_@ComponentScan(basePackages = {"com.raj.springlearnone","raj.component.scan"})_**
