package com.cts.junit.junitexamples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.platform.runner.JUnitPlatform;

import org.junit.runner.RunWith;

/**
 * Unit test for simple App.
 */
@RunWith(JUnitPlatform.class)

public class AppTest     
{
	
	@Test
	@Tag("all")
	 void addNumbersFromAppTEst(){
		 ArthmeticOperations arthOpsObj = new ArthmeticOperations();			
			System.out.println("into addnumbers");
			Assertions.assertEquals(12,arthOpsObj.addNumbers(10, 2));		
	}
    
}
