package com.orangehrm.tests.samplenew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExpediaSite {
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium project123\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.ca/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id = 'hotel-checkin-hp-hotel']")).click();
		String month = "Aug 2019";
		String day = "25";
		
		while(true) {
			String text =driver.findElement(By.xpath("//caption")).getText();
			if(text.equals(month)) {
				break;
			}else {
				driver.findElement(By.xpath("/html[1]/body[1]/meso-native-marquee[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/section[2]/form[1]/div[4]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();
		}
		
		
		
	}
		List <WebElement> dates = driver.findElements(By.xpath("//div[@class = 'datepicker-cal']//div[2]//table[1]//tbody[1]//tr//td//button[1]"));
	for(WebElement dateSelect : dates) {
	String date_text = dateSelect.getText();
	String date[] =date_text.split("\n");
	if(date[1].equals(day)) {
		dateSelect.click();
		break;
	}
	
	}
	
	
	}

}
