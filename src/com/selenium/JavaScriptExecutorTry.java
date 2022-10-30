package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTry {

	public static void main(String[] args) {
		
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");
	    
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.w3schools.com/");
	    
	   // driver.manage().window().maximize();
	    
	   // System.out.println(driver.getTitle());
	    
	    
	    
	    JavascriptExecutor js= (JavascriptExecutor) driver;
	    
//	    WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//	    
//	    js.executeScript("arguments[0].click()", close);
	    
	    
	    
	  //  String title = (String) js.executeScript("return document.title;");
	    
	 //   System.out.println(title);
	    
       // WebElement about = driver.findElement(By.xpath("//a[@href=\"/html/default.asp\"][2]"));
    js.executeScript("window.scrollBy(0,4000)");
	   // js.executeScript("arguments[0].scrollIntoView(true);", about);
	    
	    
//	    
//	    js.executeScript("window.scrollBy(0,-1500)");
	    
  
	}

}
