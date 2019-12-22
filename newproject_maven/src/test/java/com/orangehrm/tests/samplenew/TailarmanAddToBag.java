package com.orangehrm.tests.samplenew;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TailarmanAddToBag {
	public WebDriver driver;
	@Test
	public void TestPopUp() throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Load app
		driver.get("https://www.tailorman.com/");

	
		//driver.findElement(By.xpath("//div[@class = \"headerlink item-menu-cls\"][contains(text(), \"READY TO WEAR\")]")).click();
		//div[@class = "headerlink item-menu-cls"][contains(text(), "READY TO WEAR")]
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for(String currentWindow : childWindow) {
			if(!parentWindow.equals(currentWindow)) {
				driver.switchTo().window(currentWindow);
				//if(driver.getTitle().contains(s))
				System.out.println(driver.getTitle());
				
			}
		}
				
	}

}
