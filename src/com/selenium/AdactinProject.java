package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinProject {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\automationProject\\CHROME\\New Version\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		
		//driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("ajithdamon");
		
		driver.findElement(By.id("password")).sendKeys("Mankatha@94");
		
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(1000);
		
		WebElement location = driver.findElement(By.id("location"));
		
		Select s=new Select(location);
		s.selectByValue("New York");
		
		WebElement hotels = driver.findElement(By.id("hotels"));
        
		Select s1=new Select(hotels);
		
		s1.selectByIndex(1);
		
		WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
		
		Select s3=new Select(roomtype);
		
		s3.selectByVisibleText("Double");
		
		WebElement roomnos = driver.findElement(By.xpath("//select[@name='room_nos']"));
		
		Select s4=new Select(roomnos);
		
		s4.selectByValue("4");
		
		WebElement datein = driver.findElement(By.xpath("//input[@name='datepick_in'][1]"));
		
		datein.clear();
		
		WebElement datein1 = driver.findElement(By.xpath("//input[@name='datepick_in'][1]"));
		
		datein1.sendKeys("01/09/2022");

		WebElement dateout2=driver.findElement(By.xpath("//input[@name='datepick_out'][1]"));
		
		dateout2.clear();
		
		dateout2.sendKeys("09/09/2022");
		
		
		WebElement adultroom = driver.findElement(By.xpath("//select[@name='adult_room'][1]"));
		
		Select s5=new Select(adultroom);
		
		s5.selectByValue("4");
		
		WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room'][1]"));
		
		Select s6=new Select(childroom);
		
		s6.selectByIndex(2);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\SCREENSHOT\\adactin.png");
		
		FileUtils.copyFile(source, destination);
		
		driver.findElement(By.id("Submit")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Ajith");
		
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Damon");
		
		driver.findElement(By.id("address")).sendKeys("No-86/B,3rd cross street, sathya nagar, padi, chennai-50");
		
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567891234567");
		
		WebElement credit = driver.findElement(By.xpath("//select[@name='cc_type']"));
		
		Select s8=new Select(credit);
		
		s8.selectByValue("VISA");
		
		WebElement expiry = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		
		Select s9=new Select(expiry);
		s9.selectByVisibleText("May");
		
        WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		
		Select s10=new Select(year);
		s10.selectByVisibleText("2022");
		
		
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("708");
		
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		
	}

}
