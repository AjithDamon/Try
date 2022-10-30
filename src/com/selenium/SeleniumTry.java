package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTry {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys("Ajith");
		
		driver.findElement(By.name("lastname")).sendKeys("Raj");
		
		
				
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("7299305255");
		
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("pwd@1234");
		
		//SINGLE DROPDOWN
		WebElement day = driver.findElement(By.id("day"));
		
		Select s =new Select(day);
		s.selectByIndex(8);
		
		WebElement month=driver.findElement(By.id("month"));
		
		Select s1=new Select(month);
		
		s1.selectByValue("9");
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s2=new Select(year);
		
		s2.selectByVisibleText("1994");
		
		
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		driver.findElement(By.name("websubmit")).click();
		

	}

}


