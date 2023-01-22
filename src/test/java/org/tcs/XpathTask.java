package org.tcs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTask {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/table-data-download-demo.html");
		driver.manage().window().fullscreen();

		List<WebElement> Position = driver.findElements(By.xpath("//th[text()='Position']//following::tr//td[2]"));
		List<WebElement> Age = driver.findElements(By.xpath("//th[text()='Age']//following::tr//td[4]"));

		for (int i = 0; i < 10; i++) {

			String positionName = Position.get(i).getText();
			String AgeName = Age.get(i).getText();

			System.out.println(positionName + " : " + AgeName);

		}
		System.out.println("----------------------");

		WebElement salary = driver.findElement(By.xpath("//td[text()='$86,000']//preceding-sibling::td[5]"));
		System.out.println(salary.getText());

		System.out.println("======================");

		WebElement Ageone = driver.findElement(By.xpath("//td[text()='33']//preceding-sibling::td[2]"));
		System.out.println(Ageone.getText());

	}

}
