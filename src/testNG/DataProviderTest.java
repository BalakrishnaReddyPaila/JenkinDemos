package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider(name="testData")
	public Object[][] dataProviderTesting() {
		
		Object[][] obj=new Object[3][2];
		
		obj[0][0]="userName1";
		obj[0][1]="password1";
		
		obj[1][0]="userName2";
		obj[1][1]="password2";
		
		
		obj[2][0]="userName3";
		obj[2][1]="password3";
		
		
		return obj;
		
	}
	@Test(dataProvider="testData")
	public void test(String username, String password) {
		System.out.println("UserName is: " +username+"   Pawword Is: "+password);
		
	}

}
