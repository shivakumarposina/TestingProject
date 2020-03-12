package com.JavaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripttests {
	 public static void main(String[] args) throws IOException {

		  System.setProperty("webdriver.chrome.driver", "E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();

		  driver.get("https://www.twoplugs.com/");

		  driver.manage().window().maximize();

		  // Syntax
		  // -------------
		  // JavascriptExecutor js = (JavascriptExecutor)driver;
		  // js.executeScript(script, args);

		  // flash
		  // ---------------------
		  WebElement joinfree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
		  JavaScriptUtilities.flash(joinfree,driver);

		  // Drawing border & take screenshot
		  // ------------------
		  JavaScriptUtilities.drawBorder(joinfree, driver);

		  File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File("C://screenshot/twoplugs.png"));

		  // Getting title of the page
		  // ---------------------------
		  String title = JavaScriptUtilities.getTitleByJS(driver);
		  System.out.println(title);

		  // Clicking on element
		  // --------------------------
		  // WebElement
		  // loginBtn=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a/span"));
		  // JavaScriptUtil.clickElementByJS(loginBtn,driver);

		  // Generate alert
		  // --------------
		  // JavaScriptUtil.generateAlert(driver, "Clicked on Login Button");

		  // Refreshing page
		  // ----------------
		  JavaScriptUtilities.refreshBrowserByJS(driver);

		  // get page inner text
		  // -------------
		  // System.out.println(JavaScriptUtil.getPageInnerText(driver));

		  // Scrolling down page
		  // JavaScriptUtil.scrollPageDown(driver);

		  // Scroll we find element on page
		  WebElement image = driver.findElement(By.id("rslides3_s0"));
		  JavaScriptUtilities.scrollIntoView(image, driver);

		 }

}
