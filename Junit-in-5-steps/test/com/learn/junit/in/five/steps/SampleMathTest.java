package com.learn.junit.in.five.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleMathTest {

	private SampleMath math = new SampleMath();
	
	@Test
	void testEmptyArray() {
	
		assertEquals(0, math.calculateSum(new int[]{}));
	}
	
	@Test
	void testArraywith3Numbers() {

		assertEquals(6, math.calculateSum(new int[] {1,2,3}));
	}

}
