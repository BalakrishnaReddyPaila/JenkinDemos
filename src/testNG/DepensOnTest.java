package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DepensOnTest {
	@Test()
	public void login() {
		System.out.println("Login Successfull");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods= {"login","logout"})
	public void search() {
		System.out.println("search Successfull");
	
	}
	
	@Test(dependsOnMethods= {"login"})
	public void logout() {
		System.out.println("Logout Successfull");
		Assert.assertTrue(false);
	}
	

}
