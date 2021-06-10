package com.orangehrm.pages.pim;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.orangehrm.pages.globalpagefactory.BasePage;
import com.orangehrm.utilities.Log;
import com.orangehrm.utilities.ReadFromExcel;

public class EmployeeListPage extends BasePage{
	
	WebDriver driver;
	ExtentTest extentTest;
	
	@FindBy(xpath = ".//*[@id='menu_pim_viewEmployeeList']")
	private WebElement linkEmployeeList;
	
	@FindBy(xpath = ".//*[@id='resultTable']/tbody/tr/td[2]")
	private List<WebElement> empIds;
	
	@FindBy(xpath = ".//*[@id='btnSave']")
	private WebElement btnSave;
	
	@FindBy(xpath = ".//*[@id='personal_txtEmpFirstName']")
	private WebElement txtFirstName;
	
	
	
	
	
	
	
	public EmployeeListPage(WebDriver driver,ExtentTest extentTest){
		super(driver);
		this.driver=driver;
		this.extentTest=extentTest;
		
	}
	
	public void navigateToEmployeeList(){
		linkEmployeeList.click();
		Log.info("Successfully navigated to Employee List");
		extentTest.log(Status.INFO, "Successfully navigated to Employee List");
	}
	
	public String verifyEmployeeRecord(String expectedEmpId){
		
	
		String actualEmpId = null;
		for (WebElement empId : empIds) {
			actualEmpId = empId.getText();
			if (actualEmpId.equals(expectedEmpId)) {				
				break;
			}
		}
		Log.info("Successfully verified Employee record");
		extentTest.log(Status.INFO, "EmP Id Created as:" +actualEmpId);
		return actualEmpId;
	}
	
	public void editEmployee(String empId){		
		WebElement empIdLink= driver.findElement(By.xpath(".//*[@id='resultTable']//a[text()='"+empId+"']"));		
		empIdLink.click();		
		btnSave.click();
		txtFirstName.clear();
		txtFirstName.sendKeys(ReadFromExcel.getCellData(1, 2));
		extentTest.log(Status.INFO, "Successfully Edited Employee First Name as " +ReadFromExcel.getCellData(1, 2));
		btnSave.click();	
		extentTest.log(Status.INFO, "Successfully Clicked on Save Button");
		
	}
	
	public String getValueFromMatchingColumn(String value, String colName) {
		String colValue = null;
		int colIndex = 0;
		List<WebElement> columns = driver.findElements(By.xpath(".//*[@id='resultTable']/thead/tr/th"));

		for (WebElement element : columns) {
			colIndex++;
			if (colName.equals(element.getText())) {
				colIndex = colIndex - 2;
				colValue = driver.findElement(By.xpath(".//*[@id='resultTable']//a[text()='" + value
						+ "']//parent::td/following-sibling::td[" + colIndex + "]")).getText();

			}
		}
		return colValue;
	}

}

	


