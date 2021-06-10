package com.orangehrm.tests.samplenew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInRedBus {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"..\\orangehrm_maven\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(5000);
		List<WebElement> element = driver.findElements(By.xpath("//div[@id = 'rb-calendar_onward_cal']/table//td"));
		int totalNodes = element.size();
		for (int i = 0; i < totalNodes; i++) {
			String date = element.get(i).getText();
			if (date.equalsIgnoreCase("3")) {
				element.get(i).click();
				break;
			}
		}

	}

}
