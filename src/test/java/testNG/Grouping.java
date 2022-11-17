package testNG;

import org.testng.annotations.Test;

public class Grouping {
	@Test(priority=1, groups= {"Regration", "Smoke"})
	public void sample() {
		System.out.println("Test Case 1");
	}
	@Test(priority=2,groups= {"Regration", "sanity"})
	public void sample1() {
		System.out.println("Test Case 2");
	}
	@Test(priority=3, groups= {"Regration", "Smoke"})
	public void sample2() {
		System.out.println("Test Case 3");
	}
	@Test(priority=4, groups= {"Regration", "sanity"})
	public void sample3() {
		System.out.println("Test Case 4");
	}
}
