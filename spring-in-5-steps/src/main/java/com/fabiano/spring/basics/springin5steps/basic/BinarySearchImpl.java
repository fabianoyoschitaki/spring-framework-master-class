package com.fabiano.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)// creates new bean every time
public class BinarySearchImpl {
	
	static Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	//Constructor Injection
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}
	
	//Setter Injection
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}

	public int binarySearch(int [] numbers, int numberToSearchFor) {
		int sortedNumbers[] = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		LOGGER.info("postConstruct is called.");
	}
	
	@PreDestroy
	public void preDestroyMethod() {
		LOGGER.info("preDestroyMethod is called.");
	}
}
