package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePOMClassJuly31;
import com.SauceDemo.POMClasses.LoginPOMClassJuly31;

public class TS04VarifyAllProductAddToCart extends TestBaseClass{

	@Test
	public void VarifyAllProductAddToCart() throws InterruptedException {
		
		
		//All Product add to cart
		HomePOMClassJuly31 hp = new HomePOMClassJuly31(driver);
		hp.ClickAllProduct();
		Thread.sleep(3000);
		System.out.println("Clicked on Add to cart For all products");
		
		//homeapage
		//validation
		String expectedCount = "6";          //given
								
		String actualCount = hp.GetTextFromAddToCart();       //actual
								
//		if(expectedCount.equals(actualCount)) {
//			System.out.println("Testcase is passed");
//		}
//		else {
//			System.out.println("Testcase is failed");
//		}
			
		Assert.assertEquals(actualCount, expectedCount);
		
								
	}

}
