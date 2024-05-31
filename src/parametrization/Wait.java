package parametrization;


import java.time.Duration;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://theautomationzone.blogspot.com/2022/08/dynamic-elements-synchronization.html");
		Thread.sleep(2000);
		
	
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("//button[text()='Show Message with small delay']")).click();   
       Thread.sleep(5000) ;
      String a = driver.findElement(By.xpath("//p[text()='This message is shown with small delay']")).getText();
        System.out.println(a);
	}

}
