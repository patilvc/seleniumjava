package verification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyName {
	
	
	String a = "Pune";
	String b = "Pune city";

	@Test
	public void TC1() {

		Assert.assertEquals(a, b,"Provide Proper City name");
	}
	
	@Test
	public void TC2() {

		Assert.assertNotEquals(a, b,"Provide another City name");
	}

}
