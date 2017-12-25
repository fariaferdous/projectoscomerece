package com.comerece.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

	
	
	@CucumberOptions
	(features="Features",
	glue="com.comerece.stepdefs",
	tags="@login"
	)
	
	public class TestRunner extends AbstractTestNGCucumberTests{}
