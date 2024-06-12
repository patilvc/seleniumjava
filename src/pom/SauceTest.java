package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceTest extends Utilityclass {

	LoginPageSauce LS;
	HomePageSauce HS;

	@BeforeClass
	public void browserlaunch() throws InterruptedException {

		OpenBrowser();
	}

	@BeforeMethod
	public void login_process() throws InterruptedException {

		LS = new LoginPageSauce(driver);
		LS.UserName();

		Thread.sleep(2000);
		LS.pass();
		Thread.sleep(2000);
		LS.submitButton();
		Thread.sleep(2000);

	}

	@Test
	public void Homepage() throws InterruptedException {

		HS = new HomePageSauce(driver);
		HS.Item1();

		Thread.sleep(2000);
		HS.addcart();
	}

}
