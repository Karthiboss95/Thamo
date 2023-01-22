package org.tcs;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test(dependsOnMethods="tc_3")
	private void tc_1() {
		System.out.println("Depends tc_1  Reg");
	}

	@Test
	private void tc_2() {
		System.out.println("Depends tc_2  Smoke");
	}

	@Test(dependsOnMethods="tc_2")
	private void tc_3() {
		System.out.println("Depends tc_3  Sanity");
	}
}
