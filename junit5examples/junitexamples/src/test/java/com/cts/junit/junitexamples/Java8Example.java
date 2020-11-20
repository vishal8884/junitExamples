package com.cts.junit.junitexamples;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class Java8Example {
	
	@Test
	@Order(1)
	public void samplejunitTest3(){
		System.out.println("into junit test method2");
	}
	
	@Test
	@Order(3)
	public void samplejunitTest(){
		System.out.println("into junit test method");
	}
	
	
	@Test
	@Order(2)
	public void samplejunitTest2(){
		System.out.println("into junit test method2");
	}
	

}
