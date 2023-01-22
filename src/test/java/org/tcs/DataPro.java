package org.tcs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro extends BaseClassA {

	@Test(dataProvider="datapro")
	private void login(String username,String password) {
		browserLanuch("https://www.facebook.com/");
		findElementId("email").sendKeys(username);
		findElementId("pass").sendKeys(password);
		
	}
	@DataProvider
	private Object[][] datapro() {

		Object[][] data = new Object[3][2];
		data[2][0]="siva";
		data[2][1]="anand@123";
		return data;
	}

}
