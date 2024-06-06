package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2 {
	

	@AfterClass
	public void Logout() {

		Reporter.log("Logout done succesfully  ", true);
	}

	@Test
	public void Loginapp() {

		Reporter.log("login done succesfully ", true);
	}

	@AfterMethod
	public void Verifyuser() {

		Reporter.log("User verified on Home page  ", true);
	}

	@BeforeClass
	public void Browseropening() {

		Reporter.log("Browser opening done", true);
	}

	@BeforeMethod
	public void Openwebsite() {

		Reporter.log("flipcart website opened", true);
	}
}


//BeforeSuite>Beforegroup>Beforetest>Beforeclass >Beforemethod>Test>Aftermethod>AfterClass>Aftertest>Aftergroup>Aftersuite
