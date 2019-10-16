package com.orangehrm.pages.pim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.orangehrm.pages.globalpagefactory.BasePage;
import com.orangehrm.utilities.Log;
import com.orangehrm.utilities.ReadFromExcel;

public class AddEmployeePage extends BasePage {
	ExtentTest extentTest;

	@FindBy(xpath = ".//*[@id='menu_pim_viewPimModule']")
	private WebElement linkPim;

	@FindBy(xpath = ".//*[@id='menu_pim_addEmployee']")
	private WebElement linkAddEmployee;

	@FindBy(xpath = ".//*[@id='firstName']")
	private WebElement txtFirstName;

	@FindBy(xpath = ".//*[@id='lastName']")
	private WebElement txtLastName;

	@FindBy(xpath = ".//*[@id='btnSave']")
	private WebElement btnSave;
	
	@FindBy(xpath = ".//*[@id='employeeId']")
	private WebElement txtEmployeeId;
	
	
	
	public AddEmployeePage(WebDriver driver,ExtentTest extentTest){
		super(driver);
		this.extentTest=extentTest;
	}

	public void navigateToPim() {

		linkPim.click();
		Log.info("Successfully navigated to PIM");
		extentTest.log(Status.INFO, "Successfully navigated to PIM");
	}

	public void navigateToAddEmployee() {
		linkAddEmployee.click();
		Log.info("Successfully navigated to Add Employee");
		extentTest.log(Status.INFO, "Successfully navigated to Add Employee");
	}

	public String addEmployeeDetails() {
		txtFirstName.sendKeys(ReadFromExcel.getCellData(1, 0));
		extentTest.log(Status.INFO, "Enter First Name as:" +ReadFromExcel.getCellData(1, 0));
		txtLastName.sendKeys(ReadFromExcel.getCellData(1, 1));
		extentTest.log(Status.INFO, "Enter Last Name as:" +ReadFromExcel.getCellData(1, 1));
		String expectedEmpId = txtEmployeeId.getAttribute("value");
		extentTest.log(Status.INFO, "Successfully retrived Emp Id:" +expectedEmpId);
		btnSave.click();		
		Log.info("Successfully add the employee details");
		extentTest.log(Status.INFO, "Successfully add the employee details");
		return expectedEmpId;

	}
}