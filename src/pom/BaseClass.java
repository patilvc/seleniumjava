package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	static WebDriver driver;

	public static void OpenBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");

		Thread.sleep(2000);
	}

}
