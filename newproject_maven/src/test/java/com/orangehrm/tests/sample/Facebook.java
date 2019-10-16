package com.orangehrm.tests.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		String month = "September 2019";
		String day = "20";
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium project123\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		List <WebElement> months = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/div"));
		for(WebElement text : months) {
			if(text.getText().equals("October 2019")) {
				System.out.println("abcd");
			}else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				
					
				}
			}
			
		
			
			
			
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr/td[contains(text(), "+day+")]")).click();
		
		
			
		}
	//*[@id="ui-datepicker-div"]/div/table/tbody/tr/td
	//*[@id="ui-datepicker-div"]/div/div/div
		
		}
	
		
		
		

	


