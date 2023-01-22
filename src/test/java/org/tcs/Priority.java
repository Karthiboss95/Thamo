

package org.tcs;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 25)
	private void tc_1() {
		System.out.println("Priority tc_1 priority=25");
	}

	@Test(priority =-180)
	private void tc_2() {
		System.out.println("Priority tc_2 priority = -180");
	}
	

	@Test(priority =-64)
	private void tc_3() {
		System.out.println("Priority tc_3 priority =-64");
	}

	@Test(priority =3,invocationCount=3, enabled=true)
	private void tc_4() {
		System.out.println("Priority tc_4 priority=25");
	}

	@Test(invocationCount=3)
	private void tc_5() {
		System.out.println("Priority tc_5");
	}

	@Test(priority =200)
	private void tc_6() {
		System.out.println("Priority tc_6 priority=200");
	}

}
