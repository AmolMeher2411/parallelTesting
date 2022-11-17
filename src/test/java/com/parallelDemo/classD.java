package com.parallelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classD {
	@Test
	public void testcase1() {
		System.out.println("This is testcase1: " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver dr= new ChromeDriver();
		dr.get("https://cucumber.io/");

	}
	@Test
	public void testcase2() {
		System.out.println("This is testcase2: " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.mobikwik.com/");
	}
	@Test
	public void testcase3() {
		System.out.println("This is testcase2: " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.google.com/");
	}

}
