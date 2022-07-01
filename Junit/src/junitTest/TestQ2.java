package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junitClass.Q2;

class TestQ2 {

	@Test
	void test() 
	{
		assertEquals(true, Q2.pal("ABC","CBA"));
	}

}
