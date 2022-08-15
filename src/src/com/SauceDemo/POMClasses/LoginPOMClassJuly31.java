package com.SauceDemo.POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClassJuly31 {

	//username element + action
	//password element + action
	//login button element + action
    
	//1.WebDriver declared
	private WebDriver driver;             //global
	
	//2.element find 
	//3.element action-method create
	
	//do not follow this method to find element
//	WebElement username = driver.findElement(By.xpath("xpath"));
//	username.sendKeys("username");
	
	//  @FindBy-->annotation-->@-->function-->method Act
	//find element - element inspect-->@FindBy
	
	//username
	@FindBy(xpath="(//input[@class='input_error form_input'])[1]")
	private WebElement username;
	
	public void sendUsername() {
		username.sendKeys("standard_user");
	}
	
	//password
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void sendPassword() {
		password.sendKeys("secret_sauce");
	}
	
	//login
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	public void clickOnLogin() {
		loginButton.click();
	}
	
	//class constructor                   //local variable
	public LoginPOMClassJuly31(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
