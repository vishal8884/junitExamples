package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void test() {
		int[] arr1= {12,3,2,1};
		int[] arr2= {1,2,3,12};
		
		Arrays.sort(arr1);
		
		assertArrayEquals(arr2, arr1);
	}
	
	@Test(expected = NullPointerException.class)
	public void test_nullarray()
	{
		int[] arr3=null;
		Arrays.sort(arr3);
		
		
	}
	
	@Test(timeout = 100)
	public void test_performance() {
		
		int[] arr= {1,2,3,4};
		
		for(int i=0;i<1000000;i++)
		{
			arr[0]=i;
			Arrays.sort(arr);
		}
	}

}
