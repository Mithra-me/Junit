package com.learn.junit.in.five.steps;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.ref.Reference;

import org.junit.jupiter.api.Test;

class AssertionsExample {

	SimpleOperations simp = new SimpleOperations();
	
	@Test
	void testAssertEquals() {
		assertEquals(4, simp.add(2, 2));
	}
	
	@Test 
	void testAssertNotEquals() {
		assertNotEquals(5, simp.add(2, 2));
	}
	
	@Test
	void testAssertTrue()
	{
		assertTrue(simp.isPositive(5));
	}
	
	@Test
	void testAssertFalse()
	{
		assertFalse(simp.isPositive(-5));
	}
	
	@Test
	void testAssertNull()
	{
		assertNull(simp.getEmptyString(), "String is not null");
	}

	@Test
	void testAssertNotNull()
	{
		assertNotNull(simp.getHelloLiteral(), "String is null");
	}
	
	@Test
	void testAssertSame()
	{
		String text = simp.getHello();
		String reference = text;
		assertSame(text,reference);
	}
	
	@Test
	void testAssertNotSame()
	{
		assertNotSame(simp.getHello(),simp.getHelloLiteral());
	}
	
	@Test
	void testAssertArrayEquals()
	{
		int[] expectedArray = new int[] {1,2,3};
		assertArrayEquals(simp.getArray(), expectedArray);
	}
}
