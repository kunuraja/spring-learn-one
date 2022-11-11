package com.raj.springlearnone;

import com.raj.springlearnone.controller.MyController;
import com.raj.springlearnone.controller.MyControllerTwo;
import com.raj.springlearnone.controller.PrimaryController;
import com.raj.springlearnone.controller.ProfileController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
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

		//============== Profile=======================

		ProfileController profileController = context.getBean(ProfileController.class);
		String profileDemoJava = profileController.profileDemoJavaConfig();
		System.out.println("profle demo for java config :" + profileDemoJava);


	}

}
