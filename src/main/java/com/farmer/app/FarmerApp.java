package com.farmer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@SpringBootApplication
@EnableTransactionManagement
public class FarmerApp {
	
	public static void main(String args[])
	{
		SpringApplication.run(FarmerApp.class, args);
	}
	
	
}
