package com.orangehrm.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orangehrm.pages.globalpagefactory.BasePage;
import com.orangehrm.utilities.Log;

public class LoginPage extends BasePage {

	@FindBy(xpath = ".//*[@id='txtUsername']")
	private WebElement txtUserName;

	@FindBy(xpath = ".//*[@id='txtPassword']")
	private WebElement txtPassword;

	@FindBy(xpath = ".//*[@id='btnLogin']")
	private WebElement btnLogin;

	@FindBy(xpath = ".//*[@id='welcome']")
	private WebElement linkWelcome;

	@FindBy(xpath = ".//*[@id='welcome-menu']/ul/li[2]/a")
	private WebElement linkLogout;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void login(String userName, String password) {
		try {
			txtUserName.sendKeys(userName);
			txtPassword.sendKeys(password);
			btnLogin.click();
			Log.info("Successfully Login into application");
		} catch (Exception e) {
			Log.error("Failed to Login into the application" + e.getMessage());
		}

	}

	public void logout() {
		try {
			linkWelcome.click();
			linkLogout.click();
			Log.info("Successfully Logout from application");
		} catch (Exception e) {
			Log.error("Failed to Logout from the application" + e.getMessage());
		}
	}
}
