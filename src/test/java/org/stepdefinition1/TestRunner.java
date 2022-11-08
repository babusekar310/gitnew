package org.stepdefinition1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Babu\\eclipse-workspace\\CucumberSample\\src\\main\\resources\\FeatureFiles\\GoogleSearch.feature",glue = "org.stepdefinition1")
public class TestRunner {

}
