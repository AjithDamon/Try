package com.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTry {
	public static WebDriver driver;
	
	

	public static void main(String[] args) {
		
		String name ="India";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\New Version\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		List<WebElement> heading = driver.findElements(By.xpath("/html/body/div[3]/div[3]/div/div[6]/div[1]/div/table/tbody"));
	
	for (WebElement head : heading) {
		System.out.println(head.getText());
			
		
		
	}
	
	
	}

}
