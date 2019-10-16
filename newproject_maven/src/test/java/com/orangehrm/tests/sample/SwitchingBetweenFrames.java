package com.orangehrm.tests.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetweenFrames {
	public static void main (String args[]) {
		
		System.setProperty("webdriver.chrome.driver",
				"..\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/deprecated.html");
	}
}
