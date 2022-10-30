package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTry {
	
	public static WebDriver driver;
	
	private static void toGetAllPrices() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");
		
	 driver= new ChromeDriver();
		
	
	driver.get("https://www.flipkart.com/mobiles/pr?sid=tyy%2C4io&p%5B%5D=facets.brand%255B%255D%3Drealme&p%5B%5D=facets.availability%255B%255D%3DExclude%2BOut%2Bof%2BStock&param=7564&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIlNob3AgTm93Il0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fX19fQ%3D%3D&otracker=clp_metro_expandable_1_3.metroExpandable.METRO_EXPANDABLE_Shop%2BNow_mobile-phones-store_Q1PDG4YW86MF_wp2&fm=neo%2Fmerchandising&iid=M_77f319f4-857f-472e-b7ad-364debcbec0a_3.Q1PDG4YW86MF&ssid=pprdg94a4w0000001662692130590");
	
	
	
	List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='_3I9_wc _27UcVY']//preceding-sibling::div"));
	
	for (WebElement each : allPrices) {
		System.out.println(each.getText());
	}
	
	}
	
	

	public static void main(String[] args) {
		
		toGetAllPrices();
		

	}

}
