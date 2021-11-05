package com.example.demo;

import org.slf4j.LoggerFactory;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringbootwithJenkinsApplication {
	
	public static Logger logger = (Logger) LoggerFactory.getLogger(SpringbootwithJenkinsApplication.class);
	
	public void init() {
		logger.info("Application stared.......");
	}

	public static void main(String[] args) {
		
		logger.info("Application executed.......");
		SpringApplication.run(SpringbootwithJenkinsApplication.class, args);
		System.err.println("hello...jenkins");
	}

}
