package com.orangehrm.tests.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {
	public static void main (String args[]) {
	
	System.setProperty("webdriver.chrome.driver",
			"..\\newproject_maven\\resources\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String baseUrl = "https://www.facebook.com/";
	String tagName = "";
	driver.get(baseUrl);
	tagName = driver.findElement(By.id("email")).getTagName();
	System.out.println(tagName);

}
}