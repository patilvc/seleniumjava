package pom;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		HP.checkUserText();
		
		

	}

}
