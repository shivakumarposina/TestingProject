package com.orangehrm.tests.samplenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxInsurance {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"..//orangehrm_maven\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.maxlifeinsurance.com/online-insurance-plans/online-term-plan-plus/get-quote/TCOTP?CompanyID=3&ChannelID=3&SourceID=273&utm_source=Google+Search&utm_medium=SEM&utm_term=Keyword+category+1&utm_campaign=brand&utm_content=133273&device=d&gclid=EAIaIQobChMIu-mT15L14AIVi4BwCh1_bwDDEAAYASAAEgIm8fD_BwE");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='leadFirstName']")).sendKeys("sdjsd");
		driver.findElement(By.xpath("//input[@id='lfDob']")).sendKeys("01071991"); 
}
}