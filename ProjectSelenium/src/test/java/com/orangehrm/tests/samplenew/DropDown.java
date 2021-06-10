package com.orangehrm.tests.samplenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("urlhttps://www.facebook.com/");
		driver.manage().window().maximize();
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		System.out.println(dropDown.getOptions());

	}
}
