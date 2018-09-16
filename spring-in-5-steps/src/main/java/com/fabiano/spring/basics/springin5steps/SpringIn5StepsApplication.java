package com.fabiano.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		System.out.println(binarySearch.binarySearch(new int[] {1,2,3}, 3));
	}
}
