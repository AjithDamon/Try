package com.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartProject {

	public static String title;

	public static void flipkart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\New Version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		// driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.manage().window().maximize();

		// Electronics
		WebElement electronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		Actions a = new Actions(driver);

		a.moveToElement(electronics).build().perform();

		Thread.sleep(2000);

		// Laptop Accessories

		WebElement laptopAccessories = driver.findElement(By.xpath("//a[text()='Laptop Accessories']"));
		a.moveToElement(laptopAccessories).build().perform();

		// Laptop & Keyboard

		WebElement laptopKeyboard = driver.findElement(By.xpath("//a[text()='Laptop Keyboards']"));
		a.moveToElement(laptopKeyboard).build().perform();
		laptopKeyboard.click();

		// sorting high to low

		Thread.sleep(3000);

		WebElement highToLow = driver.findElement(By.xpath("//div[text()='Price -- High to Low']"));
		highToLow.click();

		driver.navigate().refresh();

		// laptop based on highest price

		WebElement laptop = driver.findElement(By.xpath("(//div[@class='CXW8mj'])[1]"));
		a.moveToElement(laptop).build().perform();

		laptop.click();

		Set<String> windows = driver.getWindowHandles();
		for (String window1 : windows) {
			// TO get child Window Title
			title = driver.switchTo().window(window1).getTitle();
		}
		System.out.println("Product Title :" + title);
		// To switch driver to child window
		for (String string : windows) {
			if (driver.switchTo().window(string).getTitle().equalsIgnoreCase(title)) {

				break;
			}
		}

		driver.navigate().refresh();
		// pincode input
		driver.findElement(By.id("pincodeInputId")).sendKeys("600050");

		// pincode Check
		driver.findElement(By.xpath("//span[text()='Check']")).click();

		Thread.sleep(3000);

		Thread.sleep(3000);
		// product prize
		System.out.println(
				"product prize: " + (driver.findElement(By.xpath("(//div[@class=\"_25b18c\"])[1]")).getText()));

		Thread.sleep(3000);

		driver.navigate().refresh();

		Thread.sleep(3000);
		// Delivery Date
		WebElement deliveryDate = driver.findElement(By.xpath("//span[@class='_1TPvTK']"));
		try {
			String date = deliveryDate.getText();

			System.out.println("Expected Delivery Date: " + date);
		}

		catch (Exception e) {
			System.out.println("Exception handled");
		}

		// pincode entered by user
		String pincode = driver.findElement(By.id("pincodeInputId")).getAttribute("value");

		System.out.println("Given Pincode: " + pincode);

	}

	public static void main(String[] args) throws InterruptedException {
		flipkart();
	}
}
