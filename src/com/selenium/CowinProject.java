package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CowinProject {

	public static void cowin() throws InterruptedException, AWTException {
		int count = 0;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\New Version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cowin.gov.in/");

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement state = driver.findElement(
				By.xpath("//button[text()='Search']//parent::div//parent::div//following::div//child::mat-select"));

		js.executeScript("arguments[0].scrollIntoView();", state);

		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", state);

		Robot r = new Robot();
		for (int i = 1; i <= 31; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		js.executeScript("window.scrollBy(0, -350)");

		WebElement district = driver.findElement(By.xpath("//span[text()='Select District']"));

		js.executeScript("arguments[0].scrollIntoView();", district);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", district);
		for (int i = 1; i < 5; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement search = driver.findElement(By.xpath("//button[text()='Search']"));
		js.executeScript("arguments[0].scrollIntoView();", search);
		js.executeScript("arguments[0].click();", search);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, -350)");
		// AGE
		driver.findElement(By.xpath("//label[text()='18+']")).click();
		// DOSE2;
		driver.findElement(By.xpath("//label[text()='Dose 2']")).click();
		// PAID
		driver.findElement(By.xpath("//label[text()='Paid']")).click();
		// COVISHIELD
		driver.findElement(By.xpath("//label[text()='Covishield']")).click();

		List<WebElement> hospitalDetails = driver
				.findElements(By.xpath("//h5[@class=\"center-name-title accessibility-plugin-ac\"]"));

//		for (WebElement details : hospitalDetails) {
//			
//			//m.put(details.getText(), null);
//			//System.out.println("Hospital Name: "+ details.getText());
//			
//			hospitalDetails.add(details.getText());
//		}

		System.out.println("***********************************************************************");
		List<WebElement> hospitalAddress = driver
				.findElements(By.xpath("//p[@class=\"center-name-text accessibility-plugin-ac\"]"));

//		for (WebElement address : hospitalAddress) {
//			System.out.println("Hospital Address: "+ address.getText());
//		}

		for (int i = 10; i < hospitalDetails.size(); i++) {
			count++;
			System.out.println(
					"Hospital Name :" + hospitalDetails.get(i).getText() + " Address: " + hospitalAddress.get(i).getText());
		}
		
		System.out.println("***********************************************************************");
		
		System.out.println("Total number of Hospitals Available: " +count);
	}
	

	public static void main(String[] args) throws InterruptedException, AWTException {
		cowin();
	}

}
