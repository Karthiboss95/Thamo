package org.tcs;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathCreation  {
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.seleniumeasy.com/table-data-download-demo.html");
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//th[text() = 'Salary']//following::tr//td[6]"));
		
		for (int i = 0; i < elements.size(); i++) {
//			System.out.println(elements.get(i).getText());
			List<WebElement> elements2 = driver.findElements(By.xpath("//th[text() = 'Salary']//following::tr//td[1]"));
			for (int j = 0; j < elements2.size(); j++) {
				String text = elements2.get(j).getText();
						String text2 = elements.get(i).getText();
						System.out.println(text + ":- " +text2 );
			}
		}
	}
}