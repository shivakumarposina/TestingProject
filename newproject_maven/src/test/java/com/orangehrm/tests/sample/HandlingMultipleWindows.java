package com.orangehrm.tests.sample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"..\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.guru99.com/popup.php");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		 String mainWindow = driver.getWindowHandle();
		 // To handle all new open windows
		 Set<String> s = driver.getWindowHandles();
		 Iterator<String> i1 = s.iterator();
		 while(i1.hasNext()) {
			 String childWindow = i1.next();
	            if(!mainWindow.equalsIgnoreCase(childWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(childWindow);	                                                                                                           
	                    driver.findElement(By.name("emailid"))
	                    .sendKeys("gaurav.3n@gmail.com");                			
	                    
	                    driver.findElement(By.name("btnLogin")).click();			
	                                 
				// Closing the Child Window.
	                        driver.close();		
	            }		
	        }		
	        // Switching to Parent window i.e Main Window.
	            driver.switchTo().window(mainWindow);				
	    }
	

		 

}
