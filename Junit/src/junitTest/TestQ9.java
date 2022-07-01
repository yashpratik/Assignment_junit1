package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junitClass.Q9;

class TestQ9 {

	@Test
	void test() 
	{
		assertEquals("This red car", Q9.change("This @ Red $car-."));
	}

}
