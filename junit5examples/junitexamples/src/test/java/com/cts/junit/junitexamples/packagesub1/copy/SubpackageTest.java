package com.cts.junit.junitexamples.packagesub1.copy;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class SubpackageTest {

	@Test
	@Tag("production")
	public void test() {		
		Assertions.assertEquals(2,2);		

	}

}
