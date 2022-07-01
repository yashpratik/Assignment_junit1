package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junitClass.Q1;

class TestQ1 {

	@Test
	void test() {
		assertEquals(125, Q1.hcf(625, 125));
	}

}
