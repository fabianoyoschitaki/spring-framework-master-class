package com.fabiano.spring.basics.springin5steps.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.fabiano.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

//Load the context
@RunWith(SpringRunner.class)
//@ContextConfiguration(locations="/applicationContext.xml")
@ContextConfiguration(locations="/testContext.xml") //specific for testing is also an option
public class BinarySearchXMLConfigurationTest {
	
	//Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {
		//Call method on binarySearch
		int actualResult = binarySearch.binarySearch(new int[] {}, 5);
		//Check if the value is correct
		assertEquals(3, actualResult);
	}

}
