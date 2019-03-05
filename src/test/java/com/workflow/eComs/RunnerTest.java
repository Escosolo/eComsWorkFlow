package com.workflow.eComs;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		format = {"pretty", "json:target/cucumber.json" },
		tags = {"~@Ignore"},
		//tags = {"@Login"},
		strict = false
)
public class RunnerTest {

}
