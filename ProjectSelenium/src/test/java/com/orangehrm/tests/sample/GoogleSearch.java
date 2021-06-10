package com.orangehrm.tests.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearch {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.edureka.co/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
Actions builder = new Actions(driver);
WebElement abc = driver.findElement(By.linkText("Inspect"));
builder.contextClick(abc).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	 

		}
	
}





	

