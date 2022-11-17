package com.parallelDemo;

import org.testng.annotations.Test;

public class classE {
	@Test(threadPoolSize = 5, invocationCount = 2, timeOut = 1000)
	public void testMethos1() {
		System.out.println("This is testcase1: " + Thread.currentThread().getId());

	}
	

}
