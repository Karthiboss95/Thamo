package org.tcs;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class excelDataTakeBase extends excelDataTaken {

	public static void main(String[] args) throws IOException {
		
		excelDataTaken b = new excelDataTaken();
		
		browserLanuch("https://en-gb.facebook.com/");
		
		String data1 = b.getDataformExcel("C:\\Users\\Karthikeyan\\eclipse-workspace\\Framework\\Excel\\Book1.xlsx", "Sheet1",1,2);
		WebElement userId = b.findElementId("email");
		b.Sendvalues(userId, data1);
		
		
	}
}
