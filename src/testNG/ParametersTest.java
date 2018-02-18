package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
	@Test
	@Parameters({"userName","password"})
	public void testLogin(@Optional("userName Optional")String userName,@Optional("Password Optional")String password) {
	
		System.out.println("UserName is: "+userName+"Password is: "+password);
	}

}
