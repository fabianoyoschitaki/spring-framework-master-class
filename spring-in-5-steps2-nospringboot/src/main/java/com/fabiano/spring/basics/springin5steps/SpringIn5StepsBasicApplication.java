package com.fabiano.spring.basics.springin5steps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fabiano.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan("")
public class SpringIn5StepsBasicApplication {
	
	//What are the beans?
	//What are the dependencies of a bean?
	//Where to search for beans? => No need as SpringBootApplication scans package and subs
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch.equals(binarySearch1));// same bean as default scope is singleton
		
		System.out.println(binarySearch.binarySearch(new int[] {1,2,3}, 3));
	}
}
