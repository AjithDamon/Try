package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ebay {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\SELENIUM\\CHROME\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com/?norover=1&mkevt=1&mkrid=711-153320-877673-6&mkcid=2&keyword=&crlp=616001529117_&MT_ID=&geo_id=&rlsatarget=dsa-19959388920&adpos=&device=c&loc=9061919&poi=&abcId=&cmpgn=17887227751&sitelnk=&adgroupid=148531643428&network=g&matchtype=&gclid=Cj0KCQjwgO2XBhCaARIsANrW2X2aUFIMNkIPI5oztM0CKsPNcU5ACsguj8lzMbRIQ6My9dDvdnfgcugaAsoyEALw_wcB");

		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement toys = driver.findElement(By.xpath("//*[@id=\"destinations_list1\"]/ul/li[4]/a/div/div"));
		
		
		js.executeScript("arguments[0].scrollIntoView(true)", toys);
		
		js.executeScript("arguments[0].click()", toys);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"s0-16-12_2-0-1[0]-0-0-27[0]-0-toggle-button\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"s0-16-12_2-0-1[0]-0-0-27[0]-0\"]/ul/li[5]/a")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		WebElement myebay = driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]"));
		
		
		Actions a =new Actions(driver);
		
		
		
		a.moveToElement(myebay).build().perform();
		
	driver.findElement(By.xpath("//*[@id=\"gh-ul-nav\"]/li[4]/a")).click();
		
	}

}
