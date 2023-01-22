package org.tcs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.seleniumeasy.com/table-data-download-demo.html");

		driver.manage().window().maximize();

		List<WebElement> elements = driver.findElements(By.xpath("//th[text() = 'Salary']//following::tr//td[6]"));

		List<WebElement> elements1 = driver.findElements(By.xpath("//th[text() = 'Salary']//following::tr//td[1]"));
		for (int i = 0; i < elements.size(); i++) {
			String text = elements1.get(i).getText();
			String text1 = elements.get(i).getText();
			System.out.println(text + ": " + text1);
		}

	}
}
