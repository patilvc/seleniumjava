package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG6timeout {

	@Test(timeOut = 3000)
	public void demo() throws InterruptedException {

		Thread.sleep(2000);
		Reporter.log("Demo is running ", true);
	}
	
	

}
