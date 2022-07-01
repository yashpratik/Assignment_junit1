package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junitClass.Q6;

class TestQ6 {

	@Test
	void test() 
	{
		assertEquals(2, Q6.vowel("pratik"));
	}

}
