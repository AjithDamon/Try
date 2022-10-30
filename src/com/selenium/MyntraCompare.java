package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraCompare {

	public WebDriver driver;
	public int minPrice;

	private void toGetAllProductPrice() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajith\\eclipse-workspace\\Maven\\CHROME\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.myntra.com/men-casual-shirts");

		List<WebElement> price = driver
				.findElements(By.xpath("//span[@class=\"product-strike\"]//preceding-sibling::span"));

		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < price.size(); i++) {

			String string = price.get(i).getText().replaceAll("Rs. ", "");

			int parseInt = Integer.parseInt(string);

			l.add(parseInt);

		}
		System.out.println(l);
		System.out.println(price.size());
		System.out.println(l.size());

		minPrice = Collections.min(l);
		System.out.println(minPrice);
	}

	private void toGetBrandNameBasedOnMinimumPrice() {

		WebElement brandname = driver.findElement(By.xpath("//span[text()=" + minPrice + "]//ancestor::div//h3"));

		System.out.println(brandname.getText());
	}

	public static void main(String[] args) {
		MyntraCompare m = new MyntraCompare();
		m.toGetAllProductPrice();
		m.toGetBrandNameBasedOnMinimumPrice();

	}

}
