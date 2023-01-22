package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BaseClassB extends BaseClassA {

	public static void main(String[] argso) {

		BaseClassA b = new BaseClassA();

//		 b.browserLanuch("http://demo.automationtesting.in/Register.html");

		// WebElement UserID = b.findElementId("email");
		// b.Sendkeys(UserID, "data");
		//
//		 WebElement elementname = b.findElementName("login");
		// b.click(elementname);
		// b.maximize();
//		 WebElement Skills = b.findElementId("Skills");
//		 b.SelectbyIndex(Skills, 3);

		browserLanuch("http://www.greenstechnologys.com/");
		WebElement target = b.findElementByxpath("//a[text()='COURSES']");
		actions = new Actions(driver);
		actions.moveToElement(target).perform();
		
	}
}

