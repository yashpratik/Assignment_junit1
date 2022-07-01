package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junitClass.Q4;

class TestQ4 {

	@Test
	void test() 
	{
		assertEquals(true, Q4.Arm(371));
	}

}
