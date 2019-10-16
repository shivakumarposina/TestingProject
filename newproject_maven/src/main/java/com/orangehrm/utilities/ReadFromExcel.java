package com.orangehrm.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	static Sheet sheet;

	public static void initializeExcel(String fileName) throws IOException {
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wbook = new XSSFWorkbook(fis);

		sheet = wbook.getSheet("testdata");

	}

	public static String getCellData(int rowNum, int colNum) {
		String celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		return celldata;
	}

}
