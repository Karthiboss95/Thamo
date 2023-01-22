package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
public static void main(String[] args) throws IOException {
	
	File file = new File("C:\\Users\\Karthikeyan\\eclipse-workspace\\Framework\\Excel\\Book1.xlsx");
	
	FileInputStream stream = new FileInputStream(file);
	
	Workbook workbook = new XSSFWorkbook(stream);
	
	Sheet sheet = workbook.getSheet("Sheet1"); 
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(3);
//	System.out.println(cell);
	
//int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();

int type = cell.getCellType();
//System.out.println(type);

if(type == 1)
{
	String stringCellValue = cell.getStringCellValue();
	System.out.println(stringCellValue);
	
	}

if (type == 0) {
	if (DateUtil.isCellDateFormatted(cell)) {
		Date cellValue = cell.getDateCellValue();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mmm-yyyy");
		String data = dateFormat.format(cellValue);
		System.out.println(data);
	}
	else {
		double db = cell.getNumericCellValue();
		long l = (long)db;
		String data = String.valueOf(l);
		System.out.println(data);
	}
}



}		
}

