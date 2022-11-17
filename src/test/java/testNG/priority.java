package testNG;

import org.testng.annotations.Test;

public class priority {
	
	@Test(priority=1, description = "Login")
	public void abc() {
		System.out.println("Test case 1");
	}
	@Test(priority=2)
	public void dac() {
		System.out.println("Test case 2");
	}
	@Test(priority=-1)
	public void Abc() {
		System.out.println("Test case 3");
	}

}
