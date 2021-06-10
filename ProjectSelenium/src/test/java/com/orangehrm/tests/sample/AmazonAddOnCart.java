package com.orangehrm.tests.sample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddOnCart {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[18]/li[10]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[8]/li[17]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"sobe_d_b_13_1\"]/a/img")).click();
		driver.findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=0']//img[@class='s-image']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		for(String currentWindow:childwindow ) {
			if(!parentWindow.equals(currentWindow)) {
				driver.switchTo().window(currentWindow);
				driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			}
		}
		
	
	}

}
