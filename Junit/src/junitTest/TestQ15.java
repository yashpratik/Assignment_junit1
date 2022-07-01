package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import junitClass.Q15_Item;

class TestQ15 {

	Q15_Item obj = new Q15_Item();
	Scanner sc = new Scanner(System.in);
	
	@Test
	void test1() 
	{
		System.out.println("Enter item Id :");
		int it = sc.nextInt();
		assertEquals(true, obj.check(it));
	}
	
	@Test
	void test2()
	{
		System.out.println("Enter item Name :");
		String st = sc.next();
		assertEquals(true, obj.alpha(st));
	}
	
	@Test
	void test3()
	{
		System.out.println("Enter Cost price :");
		int cp = sc.nextInt();
		assertEquals(true, obj.contain(cp));
	}
	
	@Test
	void test4()
	{
		System.out.println("Enter Date of Expiry :");
		String Date_Format = "yyyy-MM-dd";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Date_Format);
		String line = sc.nextLine();
		LocalDate mdate = LocalDate.parse(line, formatter);
		assertEquals(true, obj.doe_check(mdate));
	}
	@Test
	void test5()
	{
		System.out.println("Enter cost_price :");
		int cp = sc.nextInt();
		System.out.println("Enter sell_price :");
		int sp = sc.nextInt();
		assertEquals(true, obj.same(cp, sp));
	}
}
