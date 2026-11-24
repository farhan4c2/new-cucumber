package org.stepdefinition;

import org.pageclass.POJOLogin;

import org.reusable.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends BaseClass{

	@Given("user has to launch the browser and url")
	public void user_has_to_launch_the_browser_and_url() {
	    launchBrowser();
	    launchUrl("https://www.adactinhotelapp.com/");
	}

	@When("user has to  enter the valid username and valid password")
	public void user_has_to_enter_the_valid_username_and_valid_password() {
	    POJOLogin p = new POJOLogin();
	    p.getUsername().sendKeys("java");
	    p.getPassword().sendKeys("1234");
	    
	}

	@When("user has to click the login button")
	public void user_has_to_click_the_login_button() {
	    POJOLogin p = new POJOLogin();
	    p.getLoginBt().click();
	    
	}

	@Then("verify that user has reached the homepage and close the browser")
	public void verify_that_user_has_reached_the_homepage_and_close_the_browser() {
	    driver.close();
	}

}
