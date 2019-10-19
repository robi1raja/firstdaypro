package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {

	WebDriver driver;
	public PageObjectModel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		
		
	}
	
	@FindBy(xpath="(//input[@id='email'])")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	@FindBy(xpath="(//input[@id='pass'])")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	
	
	
	
	}
	@FindBy(xpath="(//input[@value='Log In'])")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	
	
	@FindBy(xpath="//i[@class='fb_logo img sp_lFwffOkkE26 sx_46e267']")
	public WebElement proof;
	
}
