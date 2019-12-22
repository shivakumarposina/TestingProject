package com.orangehrm.tests.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']"));
System.out.println(suggestions.size());
for(int i = 0; i<= suggestions.size(); i++) {
	System.out.println(suggestions.get(i).getText());
}
	
	driver.close();
	}

}
