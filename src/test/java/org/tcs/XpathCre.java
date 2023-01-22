package org.tcs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathCre {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/table-data-download-demo.html");
		driver.manage().window().maximize();
		List<WebElement> namesList = driver
				.findElements(By.xpath("(//table [@id='example']//th[text()='Name']//following::tr//td)[1]"));
		List<WebElement> salaryList = driver
				.findElements(By.xpath("(//table[@id='example']//th[text()='Name']//following::tr//td)[6]"));
//		System.out.print("SALARY" + "NAME");
		for (int i = 0; i < namesList.size(); i++) {
			String nameofThePerson = namesList.get(i).getText();
			String salaryofThePerson = salaryList.get(i).getText();
			System.out.println(salaryofThePerson + ":" + "" + nameofThePerson);
		}
	}
}
