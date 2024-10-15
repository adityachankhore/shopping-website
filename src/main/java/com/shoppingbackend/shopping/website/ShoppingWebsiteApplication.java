package com.shoppingbackend.shopping.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//hey this project is not normal java project its springboot project
public class ShoppingWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingWebsiteApplication.class, args);
	}
	//earlier jvm used to run our code
	// now we are asking springboot to run our code
	//tomcat helps springboot application to create the server
	//tomcat provides port number to your application
}
