package com.orangehrm.tests.samplenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IciciCalendar {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"..//newproject_maven//resources//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.iciciprulife.com/term-insurance-plans/buy-icici-term-insurance-online.html?UID=1259&cid=Search:Google::Text:DM:iPS:IPRU-Search-Generic-LI:1CrLC-34CI+4Payout::Eng::1259:cpc:::&&keyword=lifeinsurance&matchtype=e&gclid=EAIaIQobChMImN7Uj4L14AIVxJWPCh10GQOvEAAYAiAAEgIlmPD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ul[@class='form-field-cont']//div[1]//div[1]//div[1]//ins[1]")).click();
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		
		String day = "22";
		Select monthpick = new Select (driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		monthpick.selectByValue("10");
		Select year = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year.selectByValue("1960");
		
		driver.findElement(By.xpath("//div//table//tbody//tr//td//a[contains(text(),"+day+")]")).click();

	}
}