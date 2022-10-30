package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationProject {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\automationProject\\CHROME\\New Version\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		
		WebElement women = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		
		women.click();
//		Actions a = new Actions(driver);
//		
//		a.moveToElement(women).build().perform();
//		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]/a")).click();
//		
//		
//		Thread.sleep(4000);
//		
		
		
	   WebElement printeddress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/h5/a"));
		
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   
	   js.executeScript("arguments[0].scrollIntoView(true)", printeddress);
	   
	   
	   driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[6]/div/div[2]/h5/a")).click();
	   
	   WebElement add_to_cart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
	   
	   js.executeScript("arguments[0].scrollIntoView(true)", add_to_cart);
	   
	   //driver.findElement(By.xpath("//*[@id=\\\"add_to_cart\\\"]/button/span")).click();
	   
	   js.executeScript("arguments[0].click()", add_to_cart);
	   
	   Thread.sleep(8000);
	   
	   driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
	   
	   WebElement add = driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_6_31_0_0\"]/span/i"));
	   
	   for(int i=1; i<6; i++) {
		   
		   add.click();
	   }
	   
	   WebElement proceed_to_checkout = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
	   js.executeScript("arguments[0].scrollIntoView(true)",proceed_to_checkout );
	   js.executeScript("arguments[0].click()", proceed_to_checkout);
	   
	   
	   WebElement Create_account = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]"));
	   
	   js.executeScript("arguments[0].scrollIntoView(true)", Create_account);
	   
	   driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("ajithdamon14@gmail.com");
	   js.executeScript("arguments[0].click()", Create_account);
	  
	   Thread.sleep(5000);
	   
	   WebElement radiobutton_mr = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
	   
	   radiobutton_mr.click();
	   
	   WebElement firstname = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
	   
	   firstname.sendKeys("Ajith");
	   
	   WebElement lastname = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
	   
	   lastname.sendKeys("Damon");
	   
	   WebElement pwd = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
	   pwd.sendKeys("pwd@123");
	   
	   
	   WebElement days = driver.findElement(By.xpath("//*[@id=\"days\"]"));
	   Select s = new Select(days);
	   
	   s.selectByValue("9");
	   
	   WebElement month = driver.findElement(By.id("months"));
	   
	   Select s1=new Select(month);
	   s1.selectByValue("9");
	   
	   
	   WebElement years = driver.findElement(By.name("years"));
	   
	   Select s2=new Select(years);
	   
	   s2.selectByValue("1994");
	   
	   WebElement checkbox1 = driver.findElement(By.id("newsletter"));
	   
	   checkbox1.click();
	   
	   WebElement checkbox2 = driver.findElement(By.id("optin"));
	   
	   checkbox2.click();
	   
	   
	   WebElement company = driver.findElement(By.id("company"));
	   
	   company.sendKeys("capgemini");
	   
	   WebElement address = driver.findElement(By.name("address1"));
		
	   address.sendKeys("No-86/B, chennai-0000000");
	   
	   WebElement address1 = driver.findElement(By.name("address2"));
		
	   address1.sendKeys("Los angles, california");
	   
	   WebElement city = driver.findElement(By.name("city"));
		
	   city.sendKeys("New York");
	   
	   WebElement state = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
	   
	   Select s3=new Select(state);
	   
	   s3.selectByValue("32");
	   
	   driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("00000");
	   
	   WebElement country = driver.findElement(By.xpath("//*[@id=\"id_country\"]"));
	   
	   Select s4=new Select(country);
	   
	   s4.selectByValue("21");
	   
	   driver.findElement(By.id("other")).sendKeys("nil");
	   
	   driver.findElement(By.id("phone")).sendKeys("7299305294");
	   
	   driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("9486643792");
	   
	   driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("chennai");
	   
	   
	   driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();
	   
	   WebElement comments = driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea"));
	   
	   js.executeScript("arguments[0].scrollIntoView(true)", comments);
	   
	   comments.sendKeys("Please deliver my product safely bitches");
	   
	   driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
	   
	   driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
	   
	   driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
	   
	   driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
	   
	   js.executeScript("window.scrollBy(0,250)");
	   
	   TakesScreenshot ts=(TakesScreenshot) driver;
	   
	   File source = ts.getScreenshotAs(OutputType.FILE);
	   
	   File destination = new File("C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\SCREENSHOT\\automationtesting.png");
	   
	   FileUtils.copyFile(source, destination);
	   
	   
	   
	   
	   
	   

	}

}
