package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junitClass.Q13;

class TestQ13 {

	@Test
	void test() 
	{
		assertEquals(10, Q13.add(5, 5));
	}
	@Test
	void test1() 
	{
		assertEquals(0, Q13.sub(5, 5));
	}
	@Test
	void test2() 
	{
		assertEquals(0, Q13.mul(0, 5));
	}
	
	@Test
	void test3()
	{
		assertEquals(true, Q13.div(5, 5));
	}
	
	@Test
	void test4()
	{
		assertEquals(true, Q13.mod(5, 0));
	}
	
	@Test
	void test5() throws Exception
	{
		assertEquals(5, Q13.pow(125));
	}
	
	@Test
	void test6() throws Exception
	{
		assertEquals(12, Q13.sqr(144));
	}

}
