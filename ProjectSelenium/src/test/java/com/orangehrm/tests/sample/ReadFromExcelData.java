package com.orangehrm.tests.sample;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcelData {
	public static void main (String args[]) throws Exception {
		Sheet sheet;
		File file = new File("E:\\selenium project123\\newproject_maven\\resources\\testdata\\Orangehrm-TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook();
		sheet = workbook.getSheet("testdata");
		System.out.println(sheet.getLastRowNum());
		for(int i=0; i<=sheet.getLastRowNum();i++) {
			int colsize =sheet.getRow(i).getLastCellNum();
			for(int j=0; j<=colsize;j++ ) {
				String celldata = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(celldata);
			}
			
		}
		
		
	}

}
