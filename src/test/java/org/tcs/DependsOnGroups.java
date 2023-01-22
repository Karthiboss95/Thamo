package org.tcs;

import org.testng.annotations.Test;

public class DependsOnGroups {

	@Test(groups="tc_2",dependsOnGroups="tc_3")
	private void tc_1() {
		System.out.println("Depends tc_2");
	}

	@Test(groups="tc_3",dependsOnGroups="tc_1")
	private void tc_2() {
		System.out.println("Depends tc_2  Smoke");
	}

	@Test(groups="tc_1")
	private void tc_3() {
		System.out.println("Depends tc_3  Sanity");
	}
}
