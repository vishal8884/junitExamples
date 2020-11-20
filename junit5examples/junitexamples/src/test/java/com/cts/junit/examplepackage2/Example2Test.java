package com.cts.junit.examplepackage2;

import static org.junit.Assert.assertNotNull;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.cts.junit.junitexamples.ArthmeticOperations;

@RunWith(JUnitPlatform.class)
public class Example2Test {
	enum Pet {
		 CAT,
		    DOG;
	}

	@Test
	@Tag("all")	
	@DisplayName("test1 method to test")
	 void test1() {
		System.out.println("into JunitExample2Test");
		Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        throw new IllegalArgumentException("error message");
	    });
	}
	
	//@Test
	@Tag("all")
	@ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}")	
	@MethodSource("twoIntValues")
	 void addNumbers(int a, int b, int sum){
		 ArthmeticOperations arthOpsObj = new ArthmeticOperations();			
			System.out.println("into addnumbers");
			Assertions.assertEquals(sum,arthOpsObj.addNumbers(a, b));		
	}
	
	static Stream<Arguments> twoIntValues(){
		return  Stream.of(
				Arguments.of(5,5,10),
				Arguments.of(10,5,15)
				);
	}
	
	 @ParameterizedTest(name = "{index} => pet=''{0}''")
	 //@EnumSource(Pet.class)
	 @EnumSource(value = Pet.class, names = {"CAT"})
	 void enumValuesAsMethodParameter(Pet pet) {
	        assertNotNull(pet);
	    }

}
