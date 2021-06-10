package com.orangehrm.tests.samplenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEstingSamples {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver",
			"..\\orangehrm_maven\\src\\test\\resources\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("https://www.att.com/accessories/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//span[contains(@class,'desktop-tablet-only')]//a[contains(@class,'btn btn-alt-small btn-secondary')][contains(text(),'Shop now')]")).click();

}
}
	

	
 
	


