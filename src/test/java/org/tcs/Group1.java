package org.tcs;

import org.testng.annotations.Test;

public class Group1 extends Group2 {

	@Test(groups="smoke")
	private void tc_1() {
		System.out.println("Group1 tc_1 Smoke");
	}
	@Test(groups="sanity")
	private void tc_2() {
		System.out.println("Group1 tc_2 Sanity");
	}
	@Test(groups="reg")
	private void tc_3() {
		System.out.println("Group1 tc_3 reg");
	}@Test(groups="smoke")
	private void tc_4() {
		System.out.println("Group1 tc_4 Smoke");
	}
	@Test(groups="sanity")
	private void tc_5() {
		System.out.println("Group1 tc_5 sanity");
	}
}
