package com.fabiano.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fabiano.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import com.fabiano.spring.basics.springin5steps.cdi.SomeCdiDao;

@Configuration
@ComponentScan("")
public class SpringIn5StepsCdiApplication {
	
	static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class);
		
		SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("{} dao-{}", someCdiBusiness, someCdiBusiness.getSomeCdiDao());
		System.out.println(someCdiBusiness + " dao-" + someCdiBusiness.getSomeCdiDao());
	}
}
