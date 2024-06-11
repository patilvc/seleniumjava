package verification;

import org.testng.annotations.Test;

import graphql.Assert;

public class VerificationTrueOrfalse {

	
	boolean a=true;
	
	boolean b=false;
	
	@Test
	public void TC1() {
		
		Assert.assertTrue(a);
		
	}
	@Test
    public void TC2() {
		
		Assert.assertFalse(b);
		
	}
	
}
