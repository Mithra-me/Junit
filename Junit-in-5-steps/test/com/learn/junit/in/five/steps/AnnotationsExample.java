package com.learn.junit.in.five.steps;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnnotationsExample {

	@BeforeAll
	static void setup()
	{
		System.out.println("Executes before all tests");
	}
	
	@BeforeEach
	void init()
	{
		System.out.println("Executes before each tests - for initilaize");
	}
	
	@Test
	void test1() {
		System.out.println("Test1");
	}
	
	@Test
	void test2() {
		System.out.println("Test2");
	}
	
	@Test
	void test3() {
		System.out.println("Test3");
	}
	
	@AfterEach
	void cleanup()
	{
		System.out.println("executes afer each tests - for closing/cleaning the resource");
	}
	
	@AfterAll
	static void done()
	{
		System.out.println("Executes after all tests are executed");
	}
	

}
