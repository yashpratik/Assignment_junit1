package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junitClass.Q12.Item;

class TestQ12 {

	@Test
	void test() throws CloneNotSupportedException
	{
		Item i1=new Item(1,"hair oil");
		Item i2=(Item)i1.clone();
		assertEquals(true, Item.checkClone(i1, i2));
	}

}
