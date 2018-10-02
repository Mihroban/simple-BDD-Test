package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-html-report"},
		features ="features",
		glue="com.simpleTest.steps",
		tags = {//"@smokeTest",
				"@test1"
		}
		
		)
public class  CucumberRunner{

}
