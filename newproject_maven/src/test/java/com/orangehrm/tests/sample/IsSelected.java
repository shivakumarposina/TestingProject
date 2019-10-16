package com.orangehrm.tests.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"..\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radioBUtton1 = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		WebElement radioButton2 = driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
		radioBUtton1.click();
		System.out.println("first radio button is selected");
		radioButton2.click();
		System.out.println("Second radio button is selected");
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));	
        option1.click();
        if(option1.isSelected()) {
        	System.out.println("button is selected");
        	
        }else {
        	System.out.println("button is not selected");
        }



}
}
