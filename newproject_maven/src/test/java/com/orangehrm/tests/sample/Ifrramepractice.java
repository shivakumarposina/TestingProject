package com.orangehrm.tests.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifrramepractice {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://hugelearning.com/iframe-practice-page/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(0); 
		driver.findElement(By.xpath("//td[1]//input[1]")).click();
		driver.switchTo().defaultContent();
		
	}

}
