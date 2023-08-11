package com.page.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features", 
		glue = "com.page.definitions",
        plugin = {"pretty", "html:target/CucumberReport.html"})

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}
