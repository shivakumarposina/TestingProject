package com.orangehrm.tests.sample;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionsWindowsHandle {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "..\\newproject_maven\\resources\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.naukri.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			System.out.println("Set Usage example: ");
			System.out.println("Window handle example");
	        String parentWindowHandle=driver.getWindowHandle();//Unique window identifier
	        System.out.println("Parent Window Handle: "+parentWindowHandle);

	        Set<String> childwindowHandles=driver.getWindowHandles();//Set of String
			String childwindow="";
	        Iterator<String> itr=childwindowHandles.iterator();
	        while(itr.hasNext())
	        {
	        	childwindow=itr.next();//get next value //next window
	        	System.out.println("Child Window Handle: "+childwindow);
	        	if(!parentWindowHandle.equals(childwindow))
	        	{
	        		driver.switchTo().window(childwindow);
	        		System.out.println("Child Window title: "+driver.getTitle());
	        		driver.close();
	        	}     
	        	else
	        		System.out.println("This is Parent window, its title: "+driver.getTitle()); 

	        }
	        driver.switchTo().window(parentWindowHandle);
	        System.out.println("Window title: "+driver.getTitle());
		}


}
 