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

public class WindowsHandle {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement travel = driver.findElement(By.xpath("(//div[@class='xtXmba'])[8]"));
		
		Actions a =new Actions(driver);
		a.contextClick(travel).build().perform();
		
		
	   Robot r =new Robot();
	   r.keyPress(KeyEvent.VK_DOWN);
	   r.keyPress(KeyEvent.VK_DOWN);
	   r.keyPress(KeyEvent.VK_UP);
	   r.keyPress(KeyEvent.VK_UP);
	   r.keyPress(KeyEvent.VK_ENTER);
	   r.keyRelease(KeyEvent.VK_ENTER);
	   
	  
	   
	  
	   
	   WebElement fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
	   //Actions a =new Actions(driver);
	   Robot r1 =new Robot();
	   a.contextClick(fashion).build().perform();
	   r1.keyPress(KeyEvent.VK_DOWN);
	   r1.keyPress(KeyEvent.VK_DOWN);
	   r1.keyPress(KeyEvent.VK_UP);
	   r1.keyPress(KeyEvent.VK_UP);
	   r1.keyPress(KeyEvent.VK_ENTER);
	   r1.keyRelease(KeyEvent.VK_ENTER);
	   
	   
 Set<String> handles = driver.getWindowHandles();
	   
	   
	   for (String string : handles) {
		   
		   System.out.println(driver.switchTo().window(string).getTitle());
		
	}
	   String flight= "Flight Booking | Book Flight Tickets at Lowest Airfare on Flipkart.com";
	   for (String string : handles) {
		   
		   if(driver.switchTo().window(string).getTitle().equalsIgnoreCase(flight)) {
			   break;
		   }
		
	}
	   
	   
	   
		

	}

}
