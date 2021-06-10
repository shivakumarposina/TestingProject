package com.orangehrm.tests.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIFrames {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[18]/li[10]/a")).click();
		driver.findElement(By.linkText("Clothing")).click();
		driver.findElement(By.xpath("//li[@id='sobe_d_b_6_3']//img[@class='a-dynamic-image sl-sobe-carousel-sub-card-img']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"sp_search_footer_shared_inner\"]/div/a")).click();
		
	}
	
	
}
