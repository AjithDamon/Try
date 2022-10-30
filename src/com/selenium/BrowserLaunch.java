package com.selenium;

import javax.swing.text.Position;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", 
        		"C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe"); //KEY (I.E)DRIVER NAME && VALUE (I.E) PATH OF THE DRIVER
        
        WebDriver driver=new ChromeDriver();  //UPCASTING - HERE WE GIVE REQUIRED CLASS NAME FOR THE REQUIRED BROWSER
        
        driver.get("https://www.facebook.com");  //AMAZON WEB PAGE 
        
        driver.manage().window().maximize(); // TO MAXIMIZE WINDOW
        
        // NAVIGATE METHODS
        
//        driver.navigate().to("https://www.flipkart.com/");  // FLIPKART WEB PAGE
//        
//        driver.navigate().back();  //BACK TO PREVIOUS PAGE  -AMAZON
//        
//        driver.navigate().forward(); //FORWARD TO THE NEXT PAGE (I.E) FLIPKART
//        
//        driver.navigate().refresh(); // REFRESH THE PAGE
//        
//        driver.get("https://www.amazon.in/ref=nav_logo");
        
//        System.out.println(driver.getTitle()); // GET THE WEBSITE TAB TITLE
//        System.out.println(driver.getCurrentUrl()); //GET THE CURRENT URL OF THE WEBSITE
//        
//        driver.close(); //CLOSE THE CURRENT SESSION
//        
//        driver.quit(); // CLOSE THE ENTIRE SESSION
        
//        Dimension size=new Dimension(1000, 1000); //TO MINIMIZE WE HAVE TO CREATE NEW OBJECT
//        
//        driver.manage().window().setSize(size);
//        
//        Point position=new Point(250, 250);                (//a[@role='button'])[2]
//        
//        driver.manage().window().setPosition(position);
        
//        WebElement email = driver.findElement(By.id("email"));
//        email.sendKeys("james@gmail.com");
//        
//        WebElement pwd = driver.findElement(By.id("pass"));
//        pwd.sendKeys("12345678");
//        
//        WebElement login = driver.findElement(By.name("login"));
//        login.click();
        
        driver.findElement(By.xpath(" (//a[@role='button'])[2]")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.name("firstname")).sendKeys("Ajith");
        
        driver.findElement(By.name("lastname")).sendKeys("Damon");
        
        
        		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("729930294");
        
	}

}
