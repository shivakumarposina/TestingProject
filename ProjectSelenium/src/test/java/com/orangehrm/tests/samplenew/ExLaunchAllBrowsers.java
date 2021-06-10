package com.orangehrm.tests.samplenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExLaunchAllBrowsers {

	WebDriver driver;

	public void openBrowser() {
		String browserName = "edge";

		if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"..\\orangehrm_maven\\src\\test\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"..\\orangehrm_maven\\src\\test\\resources\\drivers\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"..\\orangehrm_maven\\src\\test\\resources\\drivers\\MicrosoftWebDriver.exe");

			driver = new EdgeDriver();
		} else {
			System.out.println("Inavalid Browser");
		}

	}

	public void openApp() {
		driver.get("http://127.0.0.1/orangehrm-4.1/symfony/web/index.php/auth/login");
	}

	public void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("shivakumar123");
		driver.findElement(By.id("txtPassword")).sendKeys("Shivakumar@0730");
		driver.findElement(By.name("Submit")).submit();
	}

	public static void main(String args[]) {
		ExLaunchAllBrowsers obj = new ExLaunchAllBrowsers();
		obj.openBrowser();
		obj.openApp();
		obj.login();
	}
}
