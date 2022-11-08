package org.stepdefinition;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\Babu\\eclipse-workspace\\CucumberSample\\src\\main\\resources\\FbLoginTest.feature"},
		glue = { "org.stepdefinition"},
		monochrome = true
)
public class TestRunner {
	

}
