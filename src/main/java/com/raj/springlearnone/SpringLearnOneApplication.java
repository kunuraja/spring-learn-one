package com.raj.springlearnone;

import com.raj.springlearnone.controller.MyController;
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

	}

}
