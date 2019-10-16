package com.orangehrm.tests.samplenew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAutomationWebTable {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"\\orangehrm_maven\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		String mobile = "4438365697";
		List<WebElement> mobileNumbers = driver.findElements(By.xpath(
				"/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[5]"));
		for (WebElement mobieNumber : mobileNumbers) {
			String shiva = mobieNumber.getText();
			if (shiva.equals(mobile)) {
				Actions actions = new Actions(driver);
				WebElement ramesh = driver.findElement(By.xpath(
						"/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[5]/div[1]/following::div[1]//button[1]//i[@class ='fa fa-pencil']"));
				actions.doubleClick(ramesh).perform();
				driver.findElement(By.xpath("//input[@value='Theo']")).clear();
				driver.findElement(By.xpath("//input[@value='Theo']")).sendKeys("kumar");
				driver.findElement(By.xpath("//div[@id='1552304828612-3-uiGrid-000B-cell']//button[@type='button'][contains(text(),'Cancel')]")).click();	
				break;
			}
		}

	}

}
