package com.orangehrm.tests.samplenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mousehandling {
	@Test
	public void loanEMI() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"..//orangehrm_maven\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
		Actions actions = new Actions(driver);
		WebElement loanAmount = driver.findElement(By.cssSelector("#loanamountslider>span"));
		WebElement intrestRate = driver.findElement(By.cssSelector("#loaninterestslider>span"));
		WebElement loanTenure = driver.findElement(By.cssSelector("#loantermslider>span"));
		 
		actions.dragAndDropBy(loanAmount, 83, 0).build().perform();
		Thread.sleep(2000);
		actions.dragAndDropBy(intrestRate, 88, 0).build().perform();
		Thread.sleep(2000);
		actions.dragAndDropBy(loanTenure, -111, 0).build().perform();
		Thread.sleep(2000);
		WebElement emiAmount = driver.findElement(By.cssSelector("#emiamount >p>span"));
		String emicost = emiAmount.getText();
		Assert.assertEquals( "92,439", emicost);
		Thread.sleep(5000);
		driver.quit();
	}
}