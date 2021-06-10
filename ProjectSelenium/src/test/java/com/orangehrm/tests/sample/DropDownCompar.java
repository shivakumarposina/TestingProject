package com.orangehrm.tests.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownCompar {
	public WebDriver driver;
	@Test
	public void verifyDropDown() {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://chercher.tech/practice/dropdowns");
		driver.manage().window().maximize();
		WebElement first = driver.findElement(By.xpath("//select[@id = \"first\"]"));
		Select abcd = new Select (first);
		List<WebElement> dropDown1 = abcd.getOptions();
		List<String> originalList = new ArrayList<String>();
		for(WebElement list :  dropDown1) {
			
		originalList.add(list.getText());
		}
		WebElement targetDropdown = driver.findElement(By.id("order-same"));
		Select target = new  Select(targetDropdown);
		List<WebElement> targetListElements = target.getOptions();
		List<String> targetList = new ArrayList<String>();
		for (WebElement webElement : targetListElements) {
			targetList.add(webElement.getText());
	}
		Assert.assertEquals(originalList, targetList);
	
	}
}
