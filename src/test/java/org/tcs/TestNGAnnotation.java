package org.tcs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {

	@BeforeSuite
	private void tc_1() {
		System.out.println("TEST tC_1 @Beforetest");
	}
	@AfterSuite
	private void tc_2() {
		System.out.println("TEST tC_2 @AfterSuite");
	}
	@BeforeTest
	private void tc_3() {
		System.out.println("TEST tC_3 @BeforeTest");
	}
	@AfterTest
	private void tc_4() {
		System.out.println("TEST tC_4 @AfterTest");
	}
	@BeforeClass
	private void tc_5() {
		System.out.println("TEST tC_5 @BeforeClass");
	}
	@AfterClass
	private void tc_6() {
		System.out.println("TEST tC_6 @AfterClass");
	}
	@BeforeMethod
	private void tc_7() {
		System.out.println("TEST tC_7 @BeforeMethod");
	}
	@AfterMethod
	private void tc_8() {
		System.out.println("TEST tC_8 @AfterMethod");
	}
	@Test
	private void tc_9() {
		System.out.println("TEST tC_9 @Test");
	}
	@Test
	private void tc_91() {
		System.out.println("TEST tC_91 @Test");
	}
	}

