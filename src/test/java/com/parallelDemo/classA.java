package com.parallelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classA {
	WebDriver dr;
	@Test
	public void testcase1() throws InterruptedException {
		System.out.println("This is testcase1: " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "D:\\amol\\myproject\\Driver\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://example.testproject.io/web/");
		Thread.sleep(3000);
	}
	@Test
	public void testcase2() throws Exception {
		System.out.println("This is testcase 2: "+ Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();

		//System.setProperty("webdriver.chrome.driver", "D:\\amol\\myproject\\Driver\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);

	}
	@Test
	public void testcase3() throws Exception {
		System.out.println("This is testcase3: " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "D:\\amol\\myproject\\Driver\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://www.facebook.com/login/");
		Thread.sleep(3000);

	}

}
