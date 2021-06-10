package com.orangehrm.tests.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonorder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Woodland");
		driver.findElement(By.xpath("//input[@value = \"Go\"]")).click();
		WebElement abcd =driver.findElement(By.xpath("(//div[@class=\"a-section aok-relative s-image-tall-aspect\"])[1]"));
	System.out.println(abcd.getText());
	}

}
