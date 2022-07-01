package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junitClass.Q7;

class TestQ7 {

	@Test
	void test()
	{
		assertEquals(true, Q7.pal(515));
	}

}
