package com.orangehrm.tests.leave;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForLoop {
	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"..\\orangehrm_maven\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.axisbank.co.in/wps/portal/rBanking/axisebanking/AxisRetailLogin/!ut/p/a1/04_Sj9CPykssy0xPLMnMz0vMAfGjzOKNAzxMjIwNjLwsQp0MDBw9PUOd3HwdDQwMjIEKIoEKDHAARwNC-sP1o_ArMYIqwGNFQW6EQaajoiIAVNL82A!!/dl5/d5/L2dBISEvZ0FBIS9nQSEh/?_ga=2.233757654.9756270.1546688809-148827660.1545052138");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='loginId']")).sendKeys("851209185");
		driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("bangaramss@0730");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'PAYMENTS')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'PAYMENTS')]//following::a[1]")).click();
		
		driver.findElement(By.xpath("//input[@id='Fn8623154670045835907890WSRP:DELETE']")).click();
		

	}

}
