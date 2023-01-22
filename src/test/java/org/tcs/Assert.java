package org.tcs;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Assert extends BaseClassA {

	@Test
	public void Test1() {
		System.out.println("Test1");
	}

	@Test
	public void Test2() {
		browserLanuch("https://www.facebook.com/");
		WebElement User = findElementId("email");
		User.sendKeys("Welcome");

		String attribute = User.getAttribute("value");

		org.junit.Assert.assertFalse(attribute.equals("Welcome"));

		System.out.println("Test2");
	}

	@Test
	public void Test3() {

	}

}
