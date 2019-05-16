package com.eggtimer.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/features/Eggtimer.feature"},
		glue= {"com.eggtimer.stepdefinitions"},
		plugin ={ "pretty" , "html:target/report/cucumber", "json:target/report/json/login.json"}
		)
public class EggtimerTestRunner 
{

}
