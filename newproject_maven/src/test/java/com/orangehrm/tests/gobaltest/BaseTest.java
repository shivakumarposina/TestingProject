package com.orangehrm.tests.gobaltest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.orangehrm.pages.login.LoginPage;
import com.orangehrm.utilities.Log;
import com.orangehrm.utilities.ReadFromExcel;
import com.orangehrm.utilities.ReadProperty;

public class BaseTest {

	private WebDriver driver;
	private ExtentReports extentReport;
	private ExtentTest extentTest;

	@BeforeSuite
	public void initialize() throws IOException {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("..\\orangehrm_maven\\Reports\\OrangeHRMReport.html");
		extentReport = new ExtentReports();
		extentReport.attachReporter(htmlReporter);
		DOMConfigurator.configure("..\\orangehrm_maven\\src\\test\\resources\\log4j.xml");
		ReadProperty.initializePropertyFile();
		ReadFromExcel.initializeExcel(ReadProperty.readProperty("excelPath"));

	}

	@BeforeMethod
	public void openBrowser(Method method) {

		
		String browserName = ReadProperty.readProperty("browserName");
		extentTest = extentReport.createTest(method.getName());

		if (browserName.equals("FF")) {
			driver = new FirefoxDriver();

		} else if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", ReadProperty.readProperty("chromedriverpath"));

			driver = new ChromeDriver();

		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", ReadProperty.readProperty("iedriverpath"));

			driver = new InternetExplorerDriver();
		} else {
			Log.error("Invalid Browser.Please check the Browsername in Properties file");
		}
		driver.get(ReadProperty.readProperty("url"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Log.startTestCase(method.getName());
		Log.info("Successfully Launch the browser: " + browserName);
	}

	@AfterMethod(dependsOnMethods = "logout")
	public void closeBrowser() {
		driver.quit();
		Log.info("Successfully close the browser");
		Log.endTestCase();
	}

	@BeforeMethod(dependsOnMethods = "openBrowser")
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(ReadProperty.readProperty("username"), ReadProperty.readProperty("password"));
	}

	@AfterMethod
	public void logout() {
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.logout();
	}
	
	@AfterSuite
	public void tearDown(){
		extentReport.flush();
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public ExtentTest getExtentTest(){
		return extentTest;
	}
}
