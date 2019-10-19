package com.stepdef;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.PageObjectModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Base {
	
	PageObjectModel m;
	
	
	@Given("^User able to go to home page$")
	public void user_able_to_go_to_home_page()  {
		getDriver();
	m=PageFactory.initElements(driver, PageObjectModel.class);
		
	
	}

	@When("^User able to enter Email$")
	public void user_able_to_enter_Email()  {
		
		m.getEmail().sendKeys("robi.raza@gmail.com");
		
	   
	}

	@When("^User able to enter Password$")
	public void user_able_to_enter_Password() throws Throwable {
		m.getPassword().sendKeys("imfine000");
	  Thread.sleep(3000);
	}

	@When("^User able to click Login$")
	public void user_able_to_click_Login() {
		m.getLogin().click();
	
	}

	@When("^Login should be succesfull$")
	public void login_should_be_succesfull() {
		
	 m.proof.isDisplayed();
	
		//Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
		//System.out.println(driver.getTitle());
		
	}
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	   driver.quit();
	}
	


	

}
