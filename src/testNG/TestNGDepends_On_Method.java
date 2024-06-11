package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGDepends_On_Method {

	
	@Test
	public void login() {

		Reporter.log("Login to application", true);
     
	}
	@Test
	public void TC10() {
		
		Reporter.log("Verify user name ", true);
		
		
	}
	
	
	@Test(dependsOnMethods= {"login","TC10"})
	public void Logout() {

		Reporter.log("Logout to application", true);

	}

}
