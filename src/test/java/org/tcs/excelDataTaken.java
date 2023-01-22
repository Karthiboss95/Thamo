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

public class excelDataTaken extends BaseClassA {
	public static final int MM = 0;
	public static final int DD = 0;
	public static final int YYYY = 0;

	public String getDataformExcel(String pathname, String sheetname, int rowno, int cellno) throws IOException {

		String data = null;
		File file = new File("C:\\Users\\Karthikeyan\\eclipse-workspace\\Framework\\Excel\\Book1.xlsx");

		FileInputStream inputStream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(inputStream);

		Sheet sheet = workbook.getSheet("sheet1");

		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);

		int cellType = cell.getCellType();
		System.out.println(cellType);

		if (cellType == 1) {
			data = cell.getStringCellValue();
		}

		if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("DD-MM-YYYY");

				data = dateformat.format(dateCellValue);

			} else {
				double db = cell.getNumericCellValue();
				long l = (long) db;
				data = String.valueOf(l);

			}

		}
		return data;
	}

}
