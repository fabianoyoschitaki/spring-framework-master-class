package com.fabiano.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		boolean condition = true;
		assertEquals(2, 2);
		assertTrue(condition);
		assertFalse(!condition);
		assertNotNull(new Object());
		assertNull(null);
		assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
	}
}
