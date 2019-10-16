package com.orangehrm.tests.samplenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ReligarePage {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"..\\orangehrm_maven\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.religarehealthinsurance.com/health-insurance-plans.html?agentId=20004977&utm_source=google&utm_medium=cpc&utm_type=text&utm_campaign=ht_che_strd-101_AD_CR_both&utm_keyword=religarehealthinsurance&utm_term=1675452929&gclid=EAIaIQobChMI4t3sze7s4AIVSoWPCh1AuAqiEAAYASAAEgLl9fD_BwE#quote_tab");
		driver.manage().window().maximize();
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@id = 'numberOfAdult1']")));

		dropDown.selectByValue("5");
		Select age = new Select(driver.findElement(By.xpath("//select[@id = 'ageGroupOfEldestMember']")));
		age.selectByIndex(2);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class ='iti-arrow']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Argentina +54')]")).click();
		driver.findElement(By.xpath("//input[@id ='mobile']")).sendKeys("7777776666");
		Actions actions = new Actions(driver);
		WebElement loanAmount = driver
				.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		actions.dragAndDropBy(loanAmount, 80, 0).build().perform();
		driver.findElement(By.xpath("//input[@id = 'tenure2']")).click();
		driver.findElement(By.xpath("//label[@for= 'roundedTwo2']")).click();
		driver.findElement(By.xpath("//a[@title='Buy Now']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='proposalProposalDetail']//label[1]")).click();
		driver.findElement(By.xpath("//input[@id='ValidFName']")).sendKeys("xxxxxx");
		driver.findElement(By.xpath("//input[@id='ValidLName']")).sendKeys("xxxxxx");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Select month = new Select(driver.findElement(By.xpath("//select[@class ='ui-datepicker-month']")));
		month.selectByVisibleText("Apr");
		Select year = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year.selectByValue("1975");
		driver.findElement(By.xpath("/html[1]/body[1]/div[10]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).click();
		driver.findElement(By.xpath("//input[@id = 'ValidEmail']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'NomineeName']")).sendKeys("abcd");
		Select nominee = new Select(driver.findElement(By.xpath("//select[@id = 'nomineeRelation']")));
		nominee.selectByValue("BOTH");
		driver.findElement(By.xpath("//input[@id = 'ValidAddressOne']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@id = 'landmark']")).sendKeys("shdsjaf");
		driver.findElement(By.xpath("//input[@id = 'ValidPinCode']")).sendKeys("500033");
		driver.findElement(By.xpath("//input[@id = 'ValidPanCard']")).sendKeys("ASNGE2323J");

		driver.findElement(By.xpath("/html[1]/body[1]/form[2]/div[1]/div[2]/div[1]/div[8]/a[1]")).click();

	}
}
