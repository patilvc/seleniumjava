package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//input[@name='email']")private WebElement UN;
	@FindBy(xpath = "//input[@name='pass']")private WebElement Pass;
	@FindBy(xpath = "//button[@type='submit']")private WebElement SubmitButton;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void username() {

		UN.sendKeys("7066127856");
	}

	public void password() {

		Pass.sendKeys("Patil@1990");
	}

	public void submitbutton() {

		SubmitButton.click();
	}

}
