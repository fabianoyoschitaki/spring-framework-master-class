package com.fabiano.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fabiano.spring.basics.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.fabiano.spring.basics.componentscan") 
public class SpringIn5StepsComponentScanApplication {

	static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);
		
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("{}", componentDao);
		System.out.println(componentDao);
	}
}
