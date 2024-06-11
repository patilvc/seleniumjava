package verification;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertmain {
	
	
	
	String a="Pune";
	String b="Pune city";
	String c="Pune";
	
	@Test
	public void Hard_assert() {
		
		Assert.assertEquals(a, b);
		Assert.assertEquals(a, c);
		
	}
	@Test
	public void Soft_Assert() {
		
		SoftAssert soft= new SoftAssert();
		
		soft.assertEquals(a, b);
		soft.assertEquals(a, c);
		
		soft.assertAll();
		
	}
	
}
