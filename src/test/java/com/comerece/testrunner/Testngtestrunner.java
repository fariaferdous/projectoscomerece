package com.comerece.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
public class Testngtestrunner{
	
	
	@CucumberOptions
	(features="Features",
	glue="com.comerece.stepdefs",
	tags="@login"
	)
	
	public class TestRunner extends AbstractTestNGCucumberTests{}
}