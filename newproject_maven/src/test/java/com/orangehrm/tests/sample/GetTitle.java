package com.orangehrm.tests.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"..\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		  String i = driver.getCurrentUrl();
		  String expectedTitle = "Facebook – log in or sign up";
		  System.out.println(i);
		String j = driver.getTitle();
		  System.out.println(j);
		  if (j.contentEquals(expectedTitle)) {
			  System.out.println("Test passed");
		  }
		 
    } 



	}


