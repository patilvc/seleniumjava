package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG5Priority {

	@Test(priority = -2)
	public void sample() {

		Reporter.log("Sample is running ", true);
	}

	@Test(enabled=false)
	public void demo() {

		Reporter.log("demo is running ", true);
	}

	@Test(enabled=false)
	public void demo1() {

		Reporter.log("demo1 is running ", true);
	}

	@Test(priority = -1)
	public void test() {

		Reporter.log("test is running ", true);
	}

	@Test(priority = 7)
	public void Study() {

		Reporter.log("study is running ", true);
	}

}
