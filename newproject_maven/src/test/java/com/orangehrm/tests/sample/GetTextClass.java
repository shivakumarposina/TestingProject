package com.orangehrm.tests.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetTextClass {
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("shivakumar123");
		driver.findElement(By.id("txtPassword")).sendKeys("Shivakumar@0730");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
	Select select = new Select(driver.findElement(By.id("empsearch_termination")));
	List<WebElement> options = select.getOptions();
	int size = options.size();
	for(int i=0; i<size; i++) {
		String data = options.get(i).getText();
		System.out.println(data);
	
	
	}
		}
		
	}


