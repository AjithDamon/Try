package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"search2\"]")).sendKeys("Java");
		
		driver.findElement(By.xpath("//*[@id=\"learntocode_searchbtn\"]")).click();
		
	}

}
