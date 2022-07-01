package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junitClass.Q10;

class TestQ10 {

	@Test
	void test() 
	{
		assertEquals("apple-orange-banana-lemon", Q10.con(new String[] {"apple", 
				"orange","banana","lemon"}));
	}

}
