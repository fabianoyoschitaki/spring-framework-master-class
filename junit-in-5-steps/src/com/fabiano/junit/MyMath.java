package com.fabiano.junit;

public class MyMath {
	int sum (int[] numbers) {
		int sum = 0;
		for (int n : numbers) {
			sum+=n;
		}
		return sum;
	}
}
