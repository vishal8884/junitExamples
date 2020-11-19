package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper helper;
	
	@Before
	public void setupbefore()
	{
		helper=new StringHelper();
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		
		
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		//expected , actual
		
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition()
	{
		
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void test3()
	{
		
		assertEquals("CEDF", helper.truncateAInFirst2Positions("CEDF"));
	}
	
	@Test
	public void test4()
	{
		
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	
	@Test
	public void test5()
	{
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void test6()
	{
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

}
