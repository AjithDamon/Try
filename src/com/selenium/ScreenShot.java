package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
   public static void main(String[] args) throws IOException {
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe" );
	   
	   
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://www.facebook.com/");
	   
	   TakesScreenshot ts= (TakesScreenshot) driver; //TYPECASTING NARROWING
	   
	   File source=ts.getScreenshotAs(OutputType.FILE);
	   
	   File destination=new File("C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\SCREENSHOT\\error1.png");
	   
	   FileUtils.copyFile(source, destination);
	   
	 
	   
   }
	

}
