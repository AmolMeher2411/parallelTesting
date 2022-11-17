package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	@DataProvider(name="LoginTest")
	public Object[][] getdata (){
		return new Object[][] {
			{"A@gmail.com", "abc"},
			{"B@gmail.com","bcd"},
			{"c@gmail.com","cde"}
		};
	}
	@Test(priority=1, description="Login", dataProvider = "LoginTest")
	public void Login(String Username, String Password) {
		System.out.println("Username is "+ Username);
		System.out.println("Password is "+ Password);
	}

}
