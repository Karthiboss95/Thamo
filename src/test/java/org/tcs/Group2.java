package org.tcs;

import org.testng.annotations.Test;

public class Group2 {

	@Test(groups="smoke")
	private void tc_6() {
		System.out.println("Group1 tc_6 Smoke");
	}
	@Test(groups="sanity")
	private void tc_7() {
		System.out.println("Group1 tc_7 Sanity");
	}
	@Test(groups="reg")
	private void tc_8() {
		System.out.println("Group1 tc_8 reg");
	}
	@Test(groups="smoke")
	private void tc_9() {
		System.out.println("Group1 tc_9 Smoke");
	}
	
}
