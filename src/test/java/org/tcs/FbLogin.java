package org.tcs;



import org.openqa.selenium.WebElement;

public class FbLogin extends BaseClassA {
	public static void main(String[] args) {
	
		browserLanuch("https://www.facebook.com/");
		
		Pom b = new Pom();
		WebElement username = b.getUsername();
		username.sendKeys("fdfs");
		driver.navigate().refresh();
		username.sendKeys("dfs@123");
	}
	
}
