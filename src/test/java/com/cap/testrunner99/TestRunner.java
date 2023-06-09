package com.cap.testrunner99;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		junit= "--step-notifications",
		plugin = {"json:target/cucumber.json"},
		features = "Feature"
		,glue={"step_definition"}
		//,tags={"@first_name_field_validation,@succesful_login,@last_name_validation"}//or 
		,tags= {"@HotelBooking"}
		//tags= {"@incorrect_mobileNo_format"}
		)
public class TestRunner {

}
