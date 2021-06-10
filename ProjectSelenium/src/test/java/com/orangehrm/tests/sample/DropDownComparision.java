package com.orangehrm.tests.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownComparision {

	/*public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select tools = new Select(driver.findElement(By.id("tools")));
		List actualList = new ArrayList();
		List<WebElement> mytools = tools.getOptions();
		for(WebElement abc : mytools) {
			String data = abc.getText();
		//for all cell data	
			System.out.println(data);
			actualList.add(data);
			List temporaryList = new ArrayList();
			temporaryList.addAll(actualList);
			
			Collections.sort(temporaryList);
			Assert.assertTrue(actualList.equals(temporaryList));
			
			
		}

	}*/
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select tools = new Select(driver.findElement(By.id("tools1")));
		List actualList = new ArrayList();
		List<WebElement> mytools = tools.getOptions();
		for(WebElement abc : mytools) {
			String data = abc.getText();
		//for all cell data	
			System.out.println(data);
			actualList.add(data);
			List temporaryList = new ArrayList();
			temporaryList.addAll(actualList);
			//Ascending order
			Collections.sort(temporaryList);
			Assert.assertTrue(actualList.equals(temporaryList));
	/*//descendingorder
			Collections.sort(temporaryList,Collections.reverseOrder());*/
	
		
}
}
}