package com.raj.springlearnone;

import com.raj.springlearnone.controller.ProfileController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLearnOneApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringLearnOneApplication.class, args);
		ProfileController profileController = context.getBean(ProfileController.class);
		System.out.println(profileController.demoProfileController());

	}

}
