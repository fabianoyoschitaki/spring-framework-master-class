package com.fabiano.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

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
