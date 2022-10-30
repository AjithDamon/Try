package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPath {

	public static void main(String[] args) {

 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/men-kurtas");
		
		//driver.manage().window().maximize();
		
		List<WebElement> cloths = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		
		ArrayList<Object> a = new ArrayList<Object>();
		
		LinkedList<Object> b = new LinkedList<Object>();
		
		for(int i=0; i<cloths.size(); i++){
			
			String replaceAll = cloths.get(i).getText(); //.replaceAll("Rs. ", "");
			
			//int parseInt = Integer.parseInt(replaceAll);
			
		b.add(replaceAll);	
		}
		
		
		System.out.println("Total dress available: "  +b.size());
		System.out.println("Full list of prices: " +b);
		
		System.out.println("47th INDEX:" +b.get(44));
		
		System.out.println("---------------------------------------");
		
		for (Object object : b) {
			
			System.out.println(object);
			
		}
		//System.out.println(b.get(0));
		
		//System.out.println(Collections.max(a));
		//System.out.println(Collections.min(a));

	}

}
