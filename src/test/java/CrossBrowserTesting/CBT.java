package CrossBrowserTesting;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CBT {
	WebDriver dr;
	
	@BeforeMethod
	@Parameters("browser")
	public void init(String browser) throws InterruptedException {
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "D:\\amol\\parallelTesting\\Browsers\\chromedriver.exe");
			dr= new ChromeDriver();
			Thread.sleep(2000);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver", "D:\\amol\\parallelTesting\\Browsers\\geckodriver.exe");
			dr= new FirefoxDriver();
			Thread.sleep(10000);
			break;
			
		case "ie":
			WebDriverManager.iedriver().setup();
			//System.setProperty("webdriver.ie.driver", "D:\\amol\\parallelTesting\\Browsers\\IEDriverServer.exe");
			dr= new InternetExplorerDriver();
			Thread.sleep(10000);
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			//System.setProperty("webdriver.ie.driver", "D:\\amol\\parallelTesting\\Browsers\\IEDriverServer.exe");
			dr= new EdgeDriver();
			Thread.sleep(10000);
			break;
			
		default:
			dr=null;
			break;
		}
	}
	@Test
	public void verifypage() {
		dr.get("https://www.google.com/");
		Assert.assertEquals("Google", dr.getTitle());
	}
	
	@AfterMethod
	public void teardown() {
		// TODO Auto-generated method stub
		dr.quit();
	}

}
