package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 13 pro max");
		
		Thread.sleep(2000);
		
		String attribute = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		
		System.out.println(attribute);
		
		
		
		
		
		
	}

}
