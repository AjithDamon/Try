package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[5]")).click();
		
		WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s=new Select(multi);
		
		s.selectByIndex(1);
		s.selectByValue("3");
		s.selectByVisibleText("Loadrunner");
		
		//s.deselectAll();
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		System.out.println("____________________________________________________________________________");
		
		//GET ALL AVAILABLE  OPTIONS
		List<WebElement> options = s.getOptions();
		
		for (WebElement options1 : options) {
			System.out.println("ALL AVAILABLE OPTIONS:"+options1.getText());
		}
		System.out.println("_________________________________________________________________");
		
		//GET ALL SELECTED OPTIONS
		List<WebElement> alloptions = s.getAllSelectedOptions();
		
		for (WebElement alloptions1 : alloptions) {
			System.out.println("ALL SELECTED OPTION:"+alloptions1.getText());
			
		}
		System.out.println("___________________________________________________________________");
		
		WebElement firstoption = s.getFirstSelectedOption();{
		System.out.println("FIRST SELECTED OPTION:"+firstoption.getText());
			
		}
			
		
		
		

	}

}
