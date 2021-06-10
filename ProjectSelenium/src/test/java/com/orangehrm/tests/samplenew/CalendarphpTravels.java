package com.orangehrm.tests.samplenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarphpTravels {
public static void main (String args[]) throws InterruptedException {
	String month = "June 2019";
	String day = "20";
	
	System.setProperty("webdriver.chrome.driver", "..//orangehrm_maven\\src\\test\\resources\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.phptravels.net/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name = 'checkin']")).click();
	Thread.sleep(2000);
	while(true) {
	String text = driver.findElement(By.xpath("/html[1]/body[1]/div[9]/div[1]/table[1]/thead[1]/tr[1]/th[2]")).getText();
	if(text.equals(month)) {
		break;
	}else {
		driver.findElement(By.xpath("/html[1]/body[1]/div[9]/div[1]/table[1]/thead[1]/tr[1]/th[3]")).click();
	}
}
	driver.findElement(By.xpath("//div[9]//tr//td[contains(text(), "+day+")]")).click();
}
}
 