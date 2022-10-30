package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontry {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Oppo')][1]")).click();

		Thread.sleep(3000);
		driver.switchTo();
		
		//System.out.println(driver.getTitle());
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String string : windowHandles) {
			System.out.println(driver.switchTo().window(string).getTitle());
		}
		
		

		driver.findElement(By.xpath("(//input[@type='submit'])[7]")).click();
	}

}
