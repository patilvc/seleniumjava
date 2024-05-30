package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//span[text()='Vaibhav Patil']")private WebElement UserText;
	
	
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
    public void checkUserText() {
    	
    	String a="Vaibhav Patil";
    	
    	String b=UserText.getText();
    	
     if (a.equals(b)) {
			
			System.out.println("Test Case Pass");
		}
		else {
			System.out.println("Test Case Fail");
		}
    	
    }
}
