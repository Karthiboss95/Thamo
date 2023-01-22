package org.tcs;

import org.testng.annotations.Test;

public class ParellelProg extends BaseClassA {

		
		@Test
		private void tc_1() {
		browserLanuch("https://demo.automationtesting.in/Register.html");
		System.out.println("PrallelProg tc_1");
		}
		
		@Test
		private void tc_2() {
		browserLanuch("https://www.facebook.com/");
		System.out.println("PrallelProg tc_2");
		}
		
		@Test
		private void tc_3() {
		browserLanuch("https://www.instagram.com/");
		System.out.println("PrallelProg tc_3");
		}
		
		
	}

