package org.tcs;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class classA extends BaseClassA {

	@BeforeClass
	public static void test1() {
		browserLanuch("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("class @BeforeClass");
	}

	@AfterClass
	public static void test2() {
		// driver.close();
		System.out.println("class @AfterClass");
	}

	@Before
	public void test3() throws IOException {

		findElementByxpath("//div[@class='_6luv _52jv']");
		Takescreenshot("C:\\Users\\Karthikeyan\\Pictures\\junit1.png");
		long start = System.currentTimeMillis();
		System.out.println(start);
		System.out.println("class @before");
	}

	@After
	public void test4() throws IOException {
		findElementByxpath("//div[@class='_6luv _52jv']");
		Takescreenshot("C:\\Users\\Karthikeyan\\Pictures\\junit2.png");
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println("class @after");
	}

	@Test
	public void test5() {
		findElementId("email").sendKeys("hello");
		findElementId("pass").sendKeys("kjdfk@23");
		findElementName("login").click();

		System.out.println("class @test");
	}

}
