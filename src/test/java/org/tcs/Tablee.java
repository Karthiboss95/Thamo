package org.tcs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tablee {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/table-data-download-demo.html");
		driver.manage().window().maximize();

		List<WebElement> Age = driver.findElements(By.xpath("//table//th[text()='Age']//following::tr//td[4]"));
		List<WebElement> Position = driver
				.findElements(By.xpath("//table//th[text()='Position']//following::tr//td[2]"));

		for (int i = 0; i < 10; i++) {

			String age = Age.get(i).getText();
			String position = Position.get(i).getText();
			System.out.println(age + ":-" + position);

		}

		System.out.println("-------------------------------");

		WebElement salary = driver.findElement(By.xpath("//td[text()='$106,450']"));
		WebElement name = driver.findElement(By.xpath("//td[text()='Caesar Vance']"));
		System.out.println(salary.getText() + "-" + name.getText());

	}
}
