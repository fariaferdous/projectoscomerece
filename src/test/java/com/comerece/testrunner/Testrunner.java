package com.comerece.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(features={"Features"}, glue={"com.comerece.stepdefs"})
public class Testrunner extends AbstractTestNGCucumberTests{

}
