package com.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinksTry {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	//driver.manage().window().maximize();
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	System.out.println(links.size());
	
	
	System.out.println(driver.getCurrentUrl());
	
	for(int i=0; i<links.size(); i++) {
		
		System.out.println(links.get(i).getText());
	}
	
	
	}

}
