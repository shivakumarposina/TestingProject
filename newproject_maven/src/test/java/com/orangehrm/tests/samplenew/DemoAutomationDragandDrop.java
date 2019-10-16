package com.orangehrm.tests.samplenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DemoAutomationDragandDrop {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\orangehrm_maven\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Interactions')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Static')]")).click();
		Thread.sleep(3000);
		WebElement drag = driver.findElement(By.xpath("//img[@id='angular']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droparea']"));
		
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		
		Action dragDrop = actions.clickAndHold(drag).moveToElement(drop).release(drop).build();

}
}
