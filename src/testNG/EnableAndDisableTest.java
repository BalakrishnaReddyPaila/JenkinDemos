package testNG;

import org.testng.annotations.Test;

public class EnableAndDisableTest {
	@Test(enabled=true, description="Login with valid data")
	public void login() {
		System.out.println("Login Successfull");
	}
	
	
	@Test(enabled=false, description="Going to search an item with valid login ")
	public void search() {
		System.out.println("Login Successfull");
	}

}
