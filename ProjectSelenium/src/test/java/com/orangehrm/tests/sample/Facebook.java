package com.orangehrm.tests.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("h://ww.f.com/");
	
		WebElement abc =driver.findElement(By.xpath("//a[@title= \"Go to Facebook home\"]"));
		for(int i=0; i<=4; i++) {
			abc.click();
			Thread.sleep(2000);
			
		}
		
			
		
			
			
			
		
		
		
			
		}
	
		}
	
		
		
		

	


