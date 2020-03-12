package com.orangehrm.tests.sample;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SslCertificate {
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium project123\\TestingProject\\newproject_maven\\resources\\drivers\\chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		WebDriver driver = new ChromeDriver(cap);
		driver.get("https://cacert.org/");
		
	}

}
