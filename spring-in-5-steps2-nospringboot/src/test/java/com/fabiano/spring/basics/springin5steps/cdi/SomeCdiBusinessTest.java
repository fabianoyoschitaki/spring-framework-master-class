package com.fabiano.spring.basics.springin5steps.cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {
	
	//Inject Mock
	@InjectMocks
	SomeCdiBusiness business;
	
	//Create Mock
	@Mock
	SomeCdiDao daoMock;
 
	@Test
	public void testBasicScenario() {
		
		//when daoMock.getData method is called return int[]{2,4};
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
		
		//Call method on binarySearch
		int actualResult = business.findGreatest();
		
		//Check if the value is correct
		assertEquals(4, actualResult);
	}
	
	@Test
	public void testBasicScenario2() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {});
		int actualResult = business.findGreatest();
		assertEquals(Integer.MIN_VALUE, actualResult);
	}
	
	@Test
	public void testBasicScenario3() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,2});
		int actualResult = business.findGreatest();
		assertEquals(2, actualResult);
	}

}
