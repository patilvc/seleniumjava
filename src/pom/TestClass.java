package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
    	LoginPage LP= new LoginPage(driver);	
		LP.username();
		Thread.sleep(1000);
		LP.password();
		Thread.sleep(1000);
		LP.submitbutton();
		
		HomePage HP= new HomePage(driver);
		driver.navigate().refresh();
		Thread.sleep(1500);
		driver.navigate().refresh();
		HP.checkUserText();
		
		

	}

}
