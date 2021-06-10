package com.orangehrm.pages.leave;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AddLeavePeriod {
	
	public void selectDDValue() {
		System.setProperty("webdriver.chrome.driver", "..\\orangehrm_maven\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.1/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("shivakumar123");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Shivakumar@0730");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
	driver.findElement(By.xpath("//a[@id='menu_leave_Configure']")).click();
	driver.findElement(By.xpath("//a[@id='menu_leave_defineLeavePeriod']")).click();
	driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
	WebElement start = driver.findElement(By.xpath("//select[@id='leaveperiod_cmbStartMonth']"));
	Select startMonth = new Select(start);
	startMonth.selectByVisibleText("February");
	WebElement start1 = driver.findElement(By.xpath("//select[@id='leaveperiod_cmbStartDate']"));
	Select startDate = new Select(start1);
	startDate.selectByValue("2");
	driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
	driver.close();
	}
	
 



	


}
