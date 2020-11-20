package com.cts.junit.junitexamples.subpackage1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ExampleSubpackageTest {

	@Test
	@Tag("production")
	public void test() {
		Assertions.assertEquals(2,2);
	}

}
