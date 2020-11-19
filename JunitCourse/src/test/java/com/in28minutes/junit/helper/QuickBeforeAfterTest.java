package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("before class");
	}
	
	@Before
	public void setup()
	{
		System.out.println("before test");
	}

	@Test
	public void test1() {
 
		System.out.println("test1");
	}
	@Test
	public void test2() {

		System.out.println("test2");
	}
	@Test
	public void test3() {

		System.out.println("test3");
	}
	
	@After
	public void tearafter()
	{
		System.out.println("after test");
	}

	@AfterClass
	public static void afterclass()
	{
		System.out.println("after class");
	}

}
