package com.selenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try {

	public static void main(String[] args) {
	
		String s ="for the people by the people off the people";
		
		String[] allwords = s.split(" ");
		Map<String, Integer>m = new HashMap<>();
		
		
		for (String word : allwords) {
			
			
			if (m.containsKey(word)) {
				
				Integer value = m.get(word);
				m.put(word, value+1);
				
			} else {
				m.put(word, 1);
			}
			
		}
		System.out.println(m);
	}

}
