package com.fabiano.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fabiano.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsComponentScanApplication {
	
	//What are the beans?
	//What are the dependencies of a bean?
	//Where to search for beans? => No need as SpringBootApplication scans package and subs
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch.equals(binarySearch1));// same bean as default scope is singleton
		
		System.out.println(binarySearch.binarySearch(new int[] {1,2,3}, 3));
	}
}
