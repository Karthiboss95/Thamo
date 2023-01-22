package org.tcs;

import org.openqa.selenium.WebElement;

public class Cache extends BaseClassA {

	public static void main(String[] args) {

		browserLanuch("https://www.facebook.com/");

		PomCache b = new PomCache();
		WebElement username = b.getUsername();
		username.sendKeys("fdfs");
		username.clear();
		// driver.navigate().refresh();
		username.sendKeys("dfs@123");

		long Start = System.currentTimeMillis();
		System.out.println(Start);

		for (int i = 0; i < 500; i++) {
			b.getUsername().getText();
		}

		long End = System.currentTimeMillis();
		System.out.println(End);

		System.out.println("diff:" + (End - Start));

		WebElement password = b.getPassword();
		password.sendKeys("abcde");
		password.clear();
		// driver.navigate().refresh();
		password.sendKeys("abc@123");

		long Start1 = System.currentTimeMillis();
		System.out.println(Start1);

		for (int i = 0; i < 500; i++) {
			b.getUsername().getText();
		}

		long End1 = System.currentTimeMillis();
		System.out.println(End1);

		System.out.println("diff:" + (End1 - Start1));

	}
}