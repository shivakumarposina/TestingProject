package com.orangehrm.tests.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllElements {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> allAnchors = driver.findElements(By.tagName("a"));
		int count = allAnchors.size();
		System.out.println(count);
		for(WebElement anchor : allAnchors) {
			String data = anchor.getText();
			System.out.println(data);
		}

}
}