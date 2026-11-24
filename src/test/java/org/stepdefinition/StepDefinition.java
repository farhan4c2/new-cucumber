package org.stepdefinition;

import java.util.List;
import java.util.Map;

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
	public void user_has_to_enter_the_valid_username_and_valid_password(io.cucumber.datatable.DataTable d) {
	   List<List<String>> l = d.asLists();
	   String user = l.get(0).get(0);
	   String pass = l.get(1).get(0);
	   
	   
		
		
		
		POJOLogin p = new POJOLogin();
	    p.getUsername().sendKeys(user);
	    p.getPassword().sendKeys(pass);
	    
	}
	
	@When("user has to  enter the valid username and valid password in map")
	public void user_has_to_enter_the_valid_username_and_valid_password_in_map(io.cucumber.datatable.DataTable d) {
	   Map<String, String> mp = d.asMap();
	   String user = mp.get("username");
	   String pass = mp.get("password");
	   
		POJOLogin p = new POJOLogin();
	    p.getUsername().sendKeys(user);
	    p.getPassword().sendKeys(pass);
	    
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



   
