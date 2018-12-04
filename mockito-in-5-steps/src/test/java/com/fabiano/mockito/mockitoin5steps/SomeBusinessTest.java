package com.fabiano.mockito.mockitoin5steps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomeBusinessTest {

	@Test
	public void testFindTheGreatestAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}

class DataServiceStub implements DataService {
	@Override
	public int[] retrieveAllData() {
		return new int [] {24, 6, 15};
	}
	
}
