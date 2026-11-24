package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.GenerateReports;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\login.feature",glue="org.stepdefinition",dryRun=false,monochrome=true
							,plugin={"html:target/html-reports/adactin.html"
									,"junit:target/junit-reports/adactin.xml"
									,"json:target/json-reports/adactin.json"})

public class TestRunner extends GenerateReports{

	@AfterClass
	public static void reportCreate() {
		jvmScript("target/json-reports/adactin.json");
	}
	
}
