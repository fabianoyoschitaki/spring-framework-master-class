package com.fabiano.mockito.mockitoin5steps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {

	@Test
	public void testFindTheGreatestAllData() {
		DataService dataServiceMock = mock(DataService.class);
		
		//what we want
		//dataServiceMock.retrieveAllData() => new int[] {24, 15, 3}
		// so, when this method we called, then return new int[] {24, 15, 3}
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 15, 3});
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

	@Test
	public void testFindTheGreatestAllData_ForOneValue() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(15, result);
	}
}
