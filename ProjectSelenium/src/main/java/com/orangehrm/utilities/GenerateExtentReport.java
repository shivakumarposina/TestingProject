package com.orangehrm.utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * 
 * @author Total-QA
 *
 */
public class GenerateExtentReport {
	WebDriver driver;

	@Test
	public void verifyHomePageTitle() throws IOException {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("E:\\selenium project123\\newproject_maven\\Reports\\OrangeHRMReport.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();

		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it
		ExtentTest test = extent.createTest("verifyHomePageTitle", "Checking the Title");

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "F:\\Selenium\\WorkSpace\\LTPT_1392\\orangehrm_maven\\src\\test\\resources\\drivers\\chromedriver.exe"
		 * ); driver = new ChromeDriver();
		 */

		// log(Status, details)
		test.log(Status.INFO, "Chrome Browser Launched Successfully");

		/* driver.get("http://total-qa.com"); */
		test.log(Status.INFO, "Navigated to URL");

		/* String actual = driver.getTitle(); */
		test.log(Status.INFO, "Actual Title returned :: ");

		String expected = "TotalQA - Future of Software Testing";
		test.log(Status.INFO, "Expected Title returned:: " + expected);

		// Assert.assertEquals(actual,expected);

		// log with snapshot
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");

		// calling flush writes everything to the log file
		extent.flush();

	}

}