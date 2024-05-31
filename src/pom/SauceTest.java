package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		
		Thread.sleep(2000);
		
		LoginPageSauce LS=new LoginPageSauce(driver);
		
		LS.UserName();
		
		Thread.sleep(2000);
		LS.pass();
		Thread.sleep(2000);
		LS.submitButton();
		Thread.sleep(2000);
		
		
		HomePageSauce HS= new HomePageSauce (driver);
		HS.Item1();
		
		Thread.sleep(2000);
		HS.addcart();
		
		
		
		
		
		
		
		
	}

}
