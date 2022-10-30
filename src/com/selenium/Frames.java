package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		
		//SINGLE FRAME
		
		
		WebElement single = driver.findElement(By.id("singleframe"));
		
		
		driver.switchTo().frame(single);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ajith");
		
		driver.switchTo().defaultContent(); //TO COME BACK TO THE ORIGINAL PAGE
		
		//DOUBLE FRAME
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(outer);
		
		WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(inner);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		
		

	}

}
