package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Karthikeyan\\eclipse-workspace\\Framework\\Excel\\Book2.xlsx");

		FileInputStream Stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(Stream);

		Sheet sheet = workbook.getSheet("Sheet1");

		Row row = sheet.getRow(1);

		Cell cell = row.getCell(1);

		int cellType = cell.getCellType();
		System.out.println(cellType);
	}
}
