package com.learn.junit.in.five.steps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestExample {

	SimpleOperations simp = new SimpleOperations();
	
	@ParameterizedTest
	@DisplayName("Test Even Numbers")
	@ValueSource(ints = {2,4,5,8,13})
	void test(int input) {
		boolean result = simp.isEven(input);
		assertTrue(result);
	}

}
