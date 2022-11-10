package com.raj.springlearnone;

import com.raj.springlearnone.controller.MyController;
import com.raj.springlearnone.controller.MyControllerTwo;
import com.raj.springlearnone.controller.PrimaryController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.raj.springlearnone","raj.component.scan"})
public class SpringLearnOneApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringLearnOneApplication.class, args);
		MyController myController = context.getBean(MyController.class);
		String qualifierDemo = myController.demoController();
		System.out.println(qualifierDemo);

		MyControllerTwo myControllerTwo = context.getBean(MyControllerTwo.class);
		String demoQualifierPrimary = myControllerTwo.demoControllerTwo();
		System.out.println(demoQualifierPrimary);

		PrimaryController primaryController = context.getBean(PrimaryController.class);
		String primaryBeanDemo = primaryController.primaryBeanController();
		System.out.println(primaryBeanDemo);


	}

}
