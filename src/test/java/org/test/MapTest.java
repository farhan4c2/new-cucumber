package org.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\map.feature",glue="org.stepdefinition",dryRun=true,monochrome=true)

public class MapTest {
	
	

}
