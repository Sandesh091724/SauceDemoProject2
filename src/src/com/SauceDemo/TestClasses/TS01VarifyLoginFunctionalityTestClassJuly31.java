package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.LoginPOMClassJuly31;

public class TS01VarifyLoginFunctionalityTestClassJuly31 extends TestBaseClass{

	@Test
	public void VarifyLoginFunctionality() throws InterruptedException {

	
		//homeapage
		//validation
		String expectedTitle = "Swag Labs";          //given
		
		String actualTitle = driver.getTitle();       //actual
		
//		if(expectedTitle.equals(actualTitle)) {
//			System.out.println("Testcase is passed");
//		}
//		else {
//			System.out.println("Testcase is failed");
//		}
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}

}
