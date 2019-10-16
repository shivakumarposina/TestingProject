package com.orangehrm.tests.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "..\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		String e = driver.findElement(By.xpath("//i[@class='fb_logo img sp_Tv-15VvRGc6 sx_fa1388']")).getText();
		System.out.println(e);

		driver.quit();

	}
}			