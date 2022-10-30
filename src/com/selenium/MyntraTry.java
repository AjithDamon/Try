package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTry {

	public static WebDriver driver;

	public static void toGetAllText() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/men-casual-shirts");

		List<WebElement> product = driver.findElements(By.xpath("//li[@class='product-base']"));

		System.out.println(product.size());

		for (int i = 0; i < product.size(); i++) {
			System.out.println(product.get(i).getText());
			System.err.println("This is No " + i);
			System.out.println("=====================================");
		}
	}

	private static void mimimumPrice() {

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

		// TO GET ALL BRAND LIST

		List<WebElement> brand = driver.findElements(By.xpath("//h3[@class='product-brand']"));

		ArrayList<String> b = new ArrayList<>();
		for (int i = 0; i < brand.size(); i++) {

			String brand1 = brand.get(i).getText();
			b.add(brand1);

		}
		System.out.println(b);

		Map<Integer, String> m = new LinkedHashMap<>();

		for (int i = 0; i < a.size(); i++) {
			// System.out.println(a.get(i) + " " + b.get(i));}

			m.put(a.get(i), b.get(i));
		}
		System.out.println(m.size());
		Set<Entry<Integer, String>> entrySet = m.entrySet();

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
		System.out.println(m.size());
	}

	public static void main(String[] args) {

		// toGetAllText();
		mimimumPrice();

	}

}
