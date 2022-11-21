package com.raj.springlearnone;

import com.raj.springlearnone.controller.ProfileController;
import com.raj.springlearnone.datasource.PropertiesDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLearnOneApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringLearnOneApplication.class, args);
		ProfileController profileController = context.getBean(ProfileController.class);
		System.out.println(profileController.demoProfileController());


		PropertiesDataSource propertiesDataSource = context.getBean(PropertiesDataSource.class);
		String dataSourceUrl = propertiesDataSource.getDbUrl();
		String dataSourceUser = propertiesDataSource.getUserName();
		String dataSourcePwd = propertiesDataSource.getPassword();

		System.out.println("User is : " + dataSourceUser);
		System.out.println("Password  is : " + dataSourcePwd);
		System.out.println("URL is : " + dataSourceUrl);

	}

}
