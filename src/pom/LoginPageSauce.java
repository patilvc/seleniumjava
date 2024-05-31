package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSauce {
	
	
	@FindBy(xpath = "//input[@data-test='username']")private WebElement UN;
	
	
	@FindBy(xpath = "//input[@data-test='password']")private WebElement Password;
	
	@FindBy(xpath = "//input[@type='submit']")private WebElement Submit;
	
	
	
	

	public LoginPageSauce(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void UserName() {

		UN.sendKeys("standard_user");;
	}

	public void pass() {

		Password.sendKeys("secret_sauce");
	}
	
	public void submitButton() {

		Submit.click();;
	}
	
	

}
