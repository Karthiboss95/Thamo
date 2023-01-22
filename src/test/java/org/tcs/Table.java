package org.tcs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://demo.seleniumeasy.com/table-data-download-demo.html");
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
//
//		List<WebElement> Age = driver.findElements(By.xpath("//table//th[text()='Age']//following::tr//td[4]"));
//		List<WebElement> Position = driver
//				.findElements(By.xpath("//table//th[text()='Position']//following::tr//td[2]"));
//
//		for (int i = 0; i < 10; i++) {
//
//			String age = Age.get(i).getText();
//			String position = Position.get(i).getText();
//			System.out.println(age + ":-" + position);
//
//		}
//
//		System.out.println("-------------------------------");
//
//		WebElement salary = driver.findElement(By.xpath("//td[text()='$86,000']//preceding-sibling::td[5]"));
//		System.out.println(salary.getText());
//
//	}
		
		List<WebElement> findElement = driver.findElements(By.id("email"));
		if (findElement.size()!=0) {
			WebElement webElement = findElement.get(0);
			webElement.sendKeys("hello");
			
		}
		
		else
		{
			System.out.println("wrst");
		}
		
}
}

