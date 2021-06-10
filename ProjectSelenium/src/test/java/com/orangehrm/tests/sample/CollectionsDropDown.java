package com.orangehrm.tests.sample;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionsDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "..\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		List<WebElement> dropDown = driver
				.findElements(By.xpath("//select[@id='select-demo']"));
		Iterator<WebElement> it = dropDown.iterator();
		String value = "";
		while(it.hasNext()) {
			WebElement element = it.next();
			value = element.getText();
			System.out.println("Element getText : " + value);
			driver.close();
		}
		

	}

}
