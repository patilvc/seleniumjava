package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG1 {
	
	
	
     @Test
	public void testCase1() 
	{

   // System.out.println("TestCase 1 is running now ");
     Reporter.log("TestCase 1 is running now",true);
	}
     @Test
	public void testCase2() 
	{

  //  System.out.println("TestCase 2 is running now ");
    Reporter.log("TestCase 2 is running now",true);

	}
	

}
