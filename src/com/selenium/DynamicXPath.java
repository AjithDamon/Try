package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPath {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?i=apparel&bbn=1968094031&rh=n%3A1571271031%2Cn%3A1968024031%2Cn%3A1968093031%2Cn%3A1968094031%2Cp_85%3A10440599031%2Cp_72%3A1318476031%2Cpct-off-with-tax%3A65-&s=apparels&dc&pf_rd_i=1968024031&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_p=cc9ae635-b647-444b-9826-d72804ca600d&pf_rd_r=HF08JXRHNKX5HK6Y7NMF&pf_rd_s=merchandised-search-6&qid=1655126066&rnid=1318475031&ref=sr_nr_p_72_1");
		
		
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-offscreen']//preceding-sibling::span"));
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		for(int i=0; i<list.size(); i++) {
			
			String replaceAll = list.get(i).getText().replaceAll("₹", "");
			
			int parseInt = Integer.parseInt(replaceAll);
			a.add(parseInt);
			
		}
		
		System.out.println(a.size());
		System.out.println(Collections.max(a));
		
		
	}

}
