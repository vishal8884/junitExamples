package com.cts.junit.examplepackage2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
//@TestInstance(LifeCycle.PER_CLASS)
class ExampleForLifeCycle {
	 
    private int sum = 1;
 
    @Test 
    @Tag("all")	
    void addingTwoReturnsThree() {
        sum += 2;
        Assertions.assertEquals(3, sum);
    }
  
    @Test   
    @Tag("all")	
    void addingThreeReturnsFour() {
        sum += 3;
        Assertions.assertEquals(4, sum);
    }
    
    
   /* @ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	void palindromes(String candidate) {
	    Assertions.assertTrue(isPalindrome(candidate));
	}
    
    public static boolean isPalindrome(String text) {

        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(cleaned);

        String reversed = plain.reverse().toString();

        return reversed.equals(cleaned);
    }*/
    
    
    /*@ParameterizedTest
    @EnumSource(Month.class) // passing all 12 months
    void getValueForAMonth_IsAlwaysBetweenOneAndTwelve(Month month) {  
      int monthNumber = month.getValue();   
      Assertions.assertTrue(monthNumber >= 1 && monthNumber <= 12);
    }*/
    
    
   /* @ParameterizedTest
    @EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    void someMonths_Are30DaysLong(Month month) {
        final boolean isALeapYear = false;
        System.out.println("month>>>>"+month.length(isALeapYear));
        Assertions.assertEquals(30, month.length(isALeapYear));
    }*/

    @Tag("all")	
    @ParameterizedTest(name= "{index} => input ={0},expected ={1}")
    @CsvFileSource(resources = "testData.csv")
    //@CsvSource({"test,TEST", "tEst,TEST", "Java,JAVA"})
    void upperCaseStringConversion(String input, String expected) {
        String actualValue = input.toUpperCase();
        Assertions.assertEquals(expected, actualValue);
    }
}