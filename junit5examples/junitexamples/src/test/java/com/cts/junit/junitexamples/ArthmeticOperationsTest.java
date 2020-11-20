package com.cts.junit.junitexamples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
//import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
//@ExtendWith(SpringExtension.class)
public class ArthmeticOperationsTest {
	 ArthmeticOperations arthOpsObj ;
	
	 
	@BeforeEach
	void createObj(){
		arthOpsObj = new ArthmeticOperations();
	}
	
	
	
	@Test
	@Tag("all")
	@DisplayName("Method to add numbers")
	//@Order(3)
	//@ParameterizedTest
	//@ValueSource(ints = { 3,5 })
	 void addNumbers(){
		 //ArthmeticOperations arthOpsObj = new ArthmeticOperations();			
			System.out.println("into addnumbers");
			Assertions.assertEquals(12,arthOpsObj.addNumbers(10, 2));		
	}
	
	@Test
	@Tag("production")
	//@RepeatedTest(3)
	//@Order(1)
	 void subNumbers(){
		// ArthmeticOperations arthOpsObj = new ArthmeticOperations();
		 Assertions.assertEquals(17,arthOpsObj.subNumbers(20, 3));
	}
	
	@Test	
	@Tag("development")
	@Tag("production")
	//@Order(2)
	void productOfNumbers(){
		 Assertions.assertEquals(25,arthOpsObj.productOfNumbers(5, 5));
	}
	
	
	/*
	 @ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	void palindromes(String candidate) {
	    Assertions.assertTrue(isPalindrome(candidate));
	} 
	  
	 
	 * public static boolean isPalindrome(String text) {

        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(cleaned);

        String reversed = plain.reverse().toString();

        return reversed.equals(cleaned);
    }*/
	
}
