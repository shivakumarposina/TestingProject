package com.orangehrm.tests.sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Naukari {
	public WebDriver driver;

	@Test
	public void TestPopUp() throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();

		// Load app
		driver.get("http://www.naukri.com/");
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for(String currentWindow : childWindow) {
			if(!currentWindow.equals(parentWindow)) {
				driver.switchTo().window(currentWindow);
				System.out.println("child window titles are: " +driver.getTitle());
				if(driver.getTitle().contains("Tech Mahindra")) {
					driver.findElement(By.xpath("/html/body/a/img")).click();
					driver.close();
				}
			}
		}
		driver.switchTo().window(parentWindow);
		System.out.println("main window title is: " +driver.getTitle());
		driver.close();

	}

}