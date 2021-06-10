package com.orangehrm.tests.samplenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTripAdvisor {
public static void main (String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "..\\orangehrm_maven\\src\\test\\resources\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.tripadvisor.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@class ='overlays-pieces-CloseX__close--3jowQ overlays-pieces-CloseX__inverted--3ADoB']")).click();
	driver.findElement(By.xpath("//span[@class='ui_icon flights brand-quick-links-QuickLinkTileItem__icon--26TMI']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class='prw_rup prw_flights_trip_search_typeahead ui_column is-6-desktop is-6-tablet rtTypeahead']//input[@placeholder='From where?']")).clear();
	driver.findElement(By.xpath("//div[@class='prw_rup prw_flights_trip_search_typeahead ui_column is-6-desktop is-6-tablet rtTypeahead']//input[@placeholder='From where?']")).sendKeys("Delhi");
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[2]")).sendKeys("Mumbai");
String date = "10-April 2019";
String splitter[] = date.split("-");
String checkInmonth_year = splitter[1];
String checkInday = splitter[0];

	
	
}

}
 