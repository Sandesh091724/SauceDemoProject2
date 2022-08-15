package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.SauceDemo.POMClasses.HomePOMClassJuly31;
import com.SauceDemo.POMClasses.LoginPOMClassJuly31;
import com.SauceDemo.UtilityClasses.ScreenShotUtilityClass;

public class TestBaseClass {
	
    WebDriver driver;
	
	@BeforeClass
	public void setUp() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Browser is maximized");

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		System.out.println("Url is opened");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@BeforeMethod
	public void login() throws InterruptedException, IOException {
		//loginActivity
		//usernamesend
		LoginPOMClassJuly31 lp = new LoginPOMClassJuly31(driver);
		lp.sendUsername();
		Thread.sleep(3000);
		System.out.println("Username is entered");
		
		//password send
		lp.sendPassword();
		Thread.sleep(3000);
		System.out.println("password is entered");

		//loginClick
		lp.clickOnLogin();
		Thread.sleep(3000);
		System.out.println("Clicked on login");      
		ScreenShotUtilityClass.takeScreenShot(driver, "HomePage");

	}
	
	@AfterMethod
	public void logout() throws InterruptedException {
		//setting select
		HomePOMClassJuly31 hp = new HomePOMClassJuly31(driver);
		hp.settingButtonClick();
		Thread.sleep(3000);
		System.out.println("Clicked on setting button");      

		//logoutclick
		hp.logoutButtonClick();
		Thread.sleep(3000);
		System.out.println("Clicked on logout button");      
						
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		System.out.println("browser is closed");
	}

}
