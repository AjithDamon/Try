package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GstLogin {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://services.gst.gov.in/services/logout");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[2]/a")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[2]/ul/li[5]/a[2]")).click();

		Actions a = new Actions(driver);

		Robot r = new Robot();

		WebElement challan = driver
				.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div/ul/li[1]/a"));

		a.contextClick(challan).build().perform();

		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
