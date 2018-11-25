package com.fabiano.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {
	
	MyMath myMath = new MyMath();
	
	@Test
	public void sumWith3Numbers() {
		//check that result is 6
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	public void sumWith1Number() {
		assertEquals(4, myMath.sum(new int[] {4}));
	}
}
