package com.orangehrm.tests.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/keyboard-events-sample-form/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
WebElement userName = driver.findElement(By.id("userName"));
WebElement currAddr = driver.findElement(By.id("currentAddress"));
WebElement perAddr = driver.findElement(By.id("permanentAddress")); 
WebElement submitButton = driver.findElement(By.id("submit"));
//Instantiate actions class
Actions actions = new Actions(driver);
actions.keyDown(Keys.CONTROL).sendKeys("r").keyUp(Keys.CONTROL).perform();
actions.sendKeys(userName, "shiva").perform(); 
//enter current address
actions.sendKeys(currAddr, "sfhfsujkfbs").perform();
//copy current address in permanant address
actions.keyDown(currAddr, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(perAddr,Keys.CONTROL).perform();
//paste current address
actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

// click on submit
submitButton.click();
//Alert accept
driver.switchTo().alert().accept();
System.out.println("Alrt accepted");

driver.close();

	}

}
