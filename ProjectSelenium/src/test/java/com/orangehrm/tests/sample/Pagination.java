package com.orangehrm.tests.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pagination {
	WebDriver driver;
	@Test
	public void handlingPage(){
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> namesElements = driver.findElements(By.xpath("//table[@id =\"example\"]//tbody//tr//td[1]"));
		List <String> names = new ArrayList<String>();
		for(WebElement namesElement : namesElements ) {
			names.add(namesElement.getText());
		}
			String NextButtonClassName = driver.findElement(By.id("example_next")).getAttribute("class");
			while(!NextButtonClassName.contains("disabled")) {
				driver.findElement(By.id("example_next")).click();
				namesElements = driver.findElements(By.xpath("//table[@id =\"example\"]//tbody//tr//td[1]"));
				for(WebElement namesElement : namesElements ) {
					names.add(namesElement.getText());	
			}
				NextButtonClassName = driver.findElement(By.id("example_next")).getAttribute("class");	
		}
	for(String name : names) {
		System.out.println(name);
	}
	int totalNames = names.size();
	System.out.println("Total Number of Names :" +totalNames);
	
	
	String displayedCount = driver.findElement(By.id("example_info")).getText().split(" ")[5];
	System.out.println("Total Number of displayed names count :" +displayedCount);
	Assert.assertEquals(displayedCount, String.valueOf(totalNames));
	driver.quit();
	
		
	}

}
