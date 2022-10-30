package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTr1 {
	
	
	public static WebDriver driver;
	
	public static int min_price;
	
	private static void minimumPrice() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/men-casual-shirts");

		// TO GET ALL PRICE LIST

		List<WebElement> allPrice = driver
				.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));

		ArrayList<Integer> a = new ArrayList<>();

		for (int i = 0; i < allPrice.size(); i++) {

			String replaceAll = allPrice.get(i).getText().replaceAll("Rs. ", "");

			int parseInt = Integer.parseInt(replaceAll);
			a.add(parseInt);

		}
		System.out.println("Full list of Prices: " + a);
		System.out.println("Total Size: " + a.size());

		System.out.println("Maximum price is: " + Collections.max(a));
		System.out.println("Minimum Price is: " + Collections.min(a));
        min_price= Collections.min(a);

	}

	private static void brandName() {
		

	}
	
	
	public static void main(String[] args) {
		minimumPrice();
		brandName();
		

	}

}
