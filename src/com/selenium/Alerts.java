package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alerts {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	driver.findElement(By.xpath("//a[@class='analystic'][1]")).click();
	
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	
	driver.switchTo().alert().accept();
	
	
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
	driver.switchTo().alert().dismiss();
	
	
	driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	
	WebElement text = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	
	
	text.click();
	

	driver.switchTo().alert().sendKeys("Ajith");
	
	driver.switchTo().alert().accept();
	
	WebElement text2 = driver.findElement(By.xpath("//p[@id='demo']"));
//	
	System.out.println(text2.getText());

	}

}
