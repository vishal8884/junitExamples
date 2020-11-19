package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class StringHelperParameterTest {

	StringHelper helper= new StringHelper();
	
	
	private String input;
	private String exprectedOutput;
	
	
	
	
	public StringHelperParameterTest(String input, String exprectedOutput) {
		this.input = input;
		this.exprectedOutput = exprectedOutput;
	}

 
	@Parameters
	public static Collection<String[]> testConditions()
	{
		String[][] exepectedOutputs={{"AACD","CD" },{"ACD","CD" }};
		return Arrays.asList(exepectedOutputs);
		
	}
	
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		
		
		assertEquals(exprectedOutput, helper.truncateAInFirst2Positions(input));
		
		
	}
	
	
	


}
