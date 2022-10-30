package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTry {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.get("https://www.myntra.com/men-sweatshirts");

WebElement dress = driver.findElement(By.xpath("//li[@class='product-base']//a//div[2]//div//span//span[1]"));


System.out.println(dress.getText());
	}

}
