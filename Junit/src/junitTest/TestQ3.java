package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junitClass.Q3;

class TestQ3 {

	@Test
	void test() throws Exception 
	{
		assertEquals(true, Q3.checkuser("pratik@gmail.com", "p12345"));
	}

}
