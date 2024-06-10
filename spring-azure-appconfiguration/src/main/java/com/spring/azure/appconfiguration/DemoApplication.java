package com.spring.azure.appconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/*
 * App Configuration
 * 
 * Please be mindful of the label you set for key-value that you create. The Label you set is the profile for the application.
*/
@SpringBootApplication
@EnableConfigurationProperties(MyProperties.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
