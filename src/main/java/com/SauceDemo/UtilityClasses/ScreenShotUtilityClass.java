package com.SauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotUtilityClass {

	public static void takeScreenShot(WebDriver driver,String a) throws IOException {
		//Date And Time Format
		Date d= new Date();
		DateFormat d1= new SimpleDateFormat("MM-dd-yyyy & HH-mm-ss");
		String date=d1.format(d);
		//ScreenShot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Desti= new File("./ScreenShotFolder/SauceDemoProject"+a+date+".jpg");
		FileHandler.copy(Source, Desti);
		System.out.println("Screenshot is taken");
	}
}
