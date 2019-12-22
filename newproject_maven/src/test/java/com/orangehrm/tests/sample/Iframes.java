package com.orangehrm.tests.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/checkboxradio/");  
	    driver.manage().window().maximize();
	  WebElement abcd =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	  driver.switchTo().frame(abcd);
	  driver.findElement(By.xpath("//label[contains(text(),'London')]")).click();
	   
	   
		   
		 
		
		   
	   }

}
