package com.bridgelabz.addressbookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@Slf4j
public class AddressBookAppApplication {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext contex = SpringApplication.run(AddressBookAppApplication.class, args);
		System.out.println("Address book backend Application");
		log.info("logging started");
		log.info("Employee payroll is started in {} environment",contex.getEnvironment().getProperty("environment"));
		log.info("Employee payroll DB user is {} ",System.getenv("username"));
	}

}
