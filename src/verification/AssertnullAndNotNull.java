package verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertnullAndNotNull {

	String a =null;
	String b = "Pune";

	
	@Test
	public void TC1() {

		Assert.assertNull(a);
	}
    @Test
	public void TC2() {

		Assert.assertNotNull(b);
		
		Assert.fail();
	}

}
