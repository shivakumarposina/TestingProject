package com.orangehrm.tests.sample;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Flipkart {
	public WebDriver driver;
	@Test
	public void login () throws InterruptedException {
		String item = "Tv";
System.setProperty("webdriver.chrome.driver", "E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class =\"_2zrpKA _1dBPDZ\"]")).sendKeys("9912552999");
		driver.findElement(By.xpath("//input[@class =\"_2zrpKA _3v41xv _1dBPDZ\"]")).sendKeys("pallavi@121121");
		driver.findElement(By.xpath("//button[@class =\"_2AkmmA _1LctnI _7UHT_c\"]")).click();
		System.out.println(driver.getTitle());
		String expectedTitle = driver.getTitle();
		String actualTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	Assert.assertEquals(actualTitle, expectedTitle);
	
	WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	Thread.sleep(30);
	searchBox.sendKeys(item);
	Thread.sleep(30);
	driver.findElement(By.xpath("//button[@type = 'submit'] [@class = 'vh79eN']")).click();
	Thread.sleep(30);
	//Fetch All the Products Text
	List<WebElement> itemNames = driver.findElements(By.xpath("//div[@class= '_3wU53n']"));
	List<WebElement> itemPrices = driver.findElements(By.xpath("//div[@class= '_1vC4OE _2rQ-NK']"));
	
	//Use of HashMap to store Products and Their prices(after conversion to Integer)
	 String productName;
	 String prodectPrice;
	 int intprodectPrice;
	 HashMap<Integer, String> finalProducts = new HashMap<Integer, String>();
	 for(int i= 0; i< itemNames.size(); i++) {
		 productName = itemNames.get(i).getText();
		 prodectPrice = itemPrices.get(i).getText();
		 prodectPrice = prodectPrice.replaceAll("[^0-9]", "");
		 intprodectPrice = Integer.parseInt(prodectPrice); //convert to integer
		 finalProducts.put(intprodectPrice, productName);
			
	 }
	//Get all the keys from Hash Map
	 Set<Integer> allKeys =finalProducts.keySet();
	 ArrayList<Integer> allPrices = new ArrayList<Integer>(allKeys);
	 
	//Sort the Prices in Array List using Collections class
			//this will sort in ascending order lowest at the top and highest at the bottom
	 Collections.sort(allPrices);
	 
	 int highestPrice = allPrices.get(allPrices.size()-1);
	 int lowestprice = allPrices.get(0);
	 System.out.println(highestPrice);
	 System.out.println(lowestprice);
	 
	
	
	}
	 

}
