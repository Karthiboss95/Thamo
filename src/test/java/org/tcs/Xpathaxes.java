package org.tcs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathaxes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://demo.wpjobboard.net/wp-login.php?redirect_to=https%3A%2F%2Fdemo.wpjobboard.net%2Fwp-admin%2F&reauth=1");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		Actions actions = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//div[text()='Job Board']"));
		actions.moveToElement(move).perform();

		driver.findElement(By.xpath("//a[text()='Applications ']")).click();

		WebElement print = driver.findElement(
				By.xpath("//a[text()='Content Creator']//parent::td//following-sibling::td[@data-colname='Posted']"));
		System.out.println(print.getText());
		
		WebElement ancestor = driver.findElement(By.xpath("//a[text()='Content Creator']//ancestor::tr//following-sibling::tr"));
		System.out.println(ancestor.getText());
		
		WebElement Print1 = driver.findElement(By.xpath("(//a[text()='Content Creator']//parent::td//preceding::td[@data-colname=\"E-mail\"])[3]"));
		System.out.println(Print1.getText());
		
		WebElement pri = driver.findElement(By.xpath("//a[text()='UI Developer']//parent::td//preceding-sibling::td//strong"));
		System.out.println(pri.getText());
		
		List<WebElement> set = driver.findElements(By.xpath("//a[text()='Content Creator']//parent::td//preceding-sibling::td"));
		for (int i = 0; i < set.size(); i++) {
			System.out.println(set.get(i).getText());
		}
		
		
	}
}