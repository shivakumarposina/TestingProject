package com.newproject.pages.healthinsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DummyClass {
public static void main (String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"..\\newproject_maven\\resources\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.bajajallianz.com/Corp/health-insurance/health-insurance-plans.jsp");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//i[@class='fa fa-times-circle']")).click();
	WebElement main = driver.findElement(By.xpath("//a[contains(text(),'Government Schemes')]"));
	WebElement second = driver.findElement(By.xpath("//ul[@class='header-sub']//a[@title='Weather Based Crop Insurance Scheme'][contains(text(),'Weather Based Crop Insurance Scheme')]"));
	Actions actions = new Actions(driver);
	actions.moveToElement(main).moveToElement(second).click().build().perform();
}
}
