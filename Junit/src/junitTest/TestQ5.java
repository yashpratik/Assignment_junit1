package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junitClass.Q5;

class TestQ5 {

	@Test
	void test() 
	{
		assertEquals(true, Q5.py(3, 4, 5));
	}

}
