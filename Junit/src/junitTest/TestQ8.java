package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junitClass.Q8;

class TestQ8 {

	@Test
	void test() 
	{
		assertEquals(true, Q8.checkeven());
	}

}
