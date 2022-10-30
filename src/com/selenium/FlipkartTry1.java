package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartTry1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions a = new Actions(driver);
		Robot r = new Robot();
		
		
		Thread.sleep(3000);
		WebElement grocery = driver.findElement(By.xpath("//div[text()='Grocery']"));
		//grocery.click();
		
		
		
		a.contextClick(grocery).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(2000);
		
		WebElement Mobiles = driver.findElement(By.xpath("//div[text()='Mobiles']"));	
		
		a.contextClick(Mobiles).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		
		
		
		for (String string : windowHandles) {
			System.out.println(driver.switchTo().window(string).getTitle());
		}
		
		String mobile="Mobile Phones Online at Best Prices in India";
		String grocery1= "Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com";
		
		for (String string : windowHandles) {
			if(driver.switchTo().window(string).getTitle().equalsIgnoreCase(grocery1)) {
				break;
			}
			
		}
		
	}

}
