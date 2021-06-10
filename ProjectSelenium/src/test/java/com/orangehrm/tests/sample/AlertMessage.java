package com.orangehrm.tests.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMessage {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "..\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/usidix/1");
		driver.findElement(By.xpath("//html//body//input")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();

}
}