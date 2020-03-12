package com.orangehrm.tests.samplenew;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String Parent = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for(String currentWindow : childWindow) {
			
			if(!currentWindow.equals(Parent)) {
				driver.switchTo().window(currentWindow);
				System.out.println(driver.getTitle());
				if(driver.getTitle().contains("Croma")) {
					driver.findElement(By.xpath("//img[@alt = \"Croma\"]")).click();
					driver.close();
				}
			}
			
		}
		
		

	}

}
