package com.orangehrm.tests.sample;

import java.util.Iterator;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collections {
	public static WebDriver driver;

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "..\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		List<WebElement> uplprecedingsibling = driver
				.findElements(By.xpath("//div//table//tbody//tr[3]//parent::td//ancestor::tr//preceding-sibling::tr"));
		Iterator<WebElement> it = uplprecedingsibling.iterator();
		String value = "";
		while (it.hasNext()) {
			WebElement element = it.next();
			value = element.getText();
			System.out.println("Element getText : " + value);
			driver.close();
		}
	}

}
