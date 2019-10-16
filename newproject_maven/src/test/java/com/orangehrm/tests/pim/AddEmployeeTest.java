package com.orangehrm.tests.pim;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.orangehrm.pages.pim.AddEmployeePage;
import com.orangehrm.pages.pim.EmployeeListPage;
import com.orangehrm.tests.gobaltest.BaseTest;
import com.orangehrm.utilities.ReadFromExcel;

public class AddEmployeeTest extends BaseTest {

	//@Test
	public void verifyAddEmployee() {		

		AddEmployeePage addeEmployeePage = new AddEmployeePage(getDriver(),getExtentTest());
		addeEmployeePage.navigateToPim();
		addeEmployeePage.navigateToAddEmployee();
		String expectedEmpId= addeEmployeePage.addEmployeeDetails();		
		EmployeeListPage employeeListPage=new EmployeeListPage(getDriver(),getExtentTest());
		employeeListPage.navigateToEmployeeList();
		String actualEmpId = employeeListPage.verifyEmployeeRecord(expectedEmpId);
		Assert.assertEquals(actualEmpId, expectedEmpId, "Verify employee record");
		getExtentTest().log(Status.PASS, "Verify Employee Record.Expected: " +expectedEmpId+" .Actual: " +actualEmpId);
		
	}

	@Test
	public void verifyEditEmployee() {

		AddEmployeePage addeEmployeePage = new AddEmployeePage(getDriver(),getExtentTest());
		addeEmployeePage.navigateToPim();
		addeEmployeePage.navigateToAddEmployee();
		String expectedEmpId = addeEmployeePage.addEmployeeDetails();
		EmployeeListPage employeeListPage=new EmployeeListPage(getDriver(),getExtentTest());
		employeeListPage.navigateToEmployeeList();
		String actualEmpId = employeeListPage.verifyEmployeeRecord(expectedEmpId);		
		employeeListPage.editEmployee(actualEmpId);
		employeeListPage.navigateToEmployeeList();
		String actualfirstName = employeeListPage.getValueFromMatchingColumn(actualEmpId,"First (& Middle) Name");
		Assert.assertEquals(actualfirstName, ReadFromExcel.getCellData(1, 2), "Verify employee record after edit");
	}

	//@Test
	public void verifyDeleteEmployee() {

		/*AddEmployeePage addeEmployeePage = new AddEmployeePage(getDriver());
		addeEmployeePage.navigateToPim();
		addeEmployeePage.navigateToAddEmployee();
		addeEmployeePage.addEmployeeDetails();*/
		
		

	}
}
