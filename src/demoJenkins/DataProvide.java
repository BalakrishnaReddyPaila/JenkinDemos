package demoJenkins;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {
	
	@DataProvider(name="login")
	public Object[][] login(){
	
		Object[][] result=new Object[5][2];
		result[0][0]="Admin1";
		result[0][1]="Manager1";
		
		
		result[1][0]="Admin1";
		result[1][1]="Manager1";
		
		result[2][0]="Admin1";
		result[2][1]="Manager1";
		
		result[3][0]="Admin1";
		result[3][1]="Manager1";
		
		result[4][0]="Admin1";
		result[4][1]="Manager1";
		return result;
		
	}
	@Test(dataProvider="login")
	public void testLogin(String name, String password){
		System.out.println("name is---"+name);
		System.out.println("name is---"+password);
		
	}
	

}
