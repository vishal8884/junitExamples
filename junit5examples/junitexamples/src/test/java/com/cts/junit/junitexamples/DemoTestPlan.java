package com.cts.junit.junitexamples;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;

@RunWith(JUnitPlatform.class)
//@SelectPackages("com.cts.junit.junitexamples")
//@IncludePackages("com.cts.junit.examplepackage2")
@SelectPackages({"com.cts.junit.junitexamples","com.cts.junit.examplepackage2"})
//@IncludeTags("production")
@IncludeTags({"production","all","development"})
//@ExcludeTags("all")

public class DemoTestPlan {

}

