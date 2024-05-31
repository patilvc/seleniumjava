package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageSauce {
	
	
    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")private WebElement Item1;
	
	
	@FindBy(xpath = "(//button[@class='btn_primary btn_inventory'][text()='ADD TO CART'])[1]")private WebElement addcart;
	

	public HomePageSauce (WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	public void Item1() {

		String a=Item1.getText();
		
		
		if (a.equals("Abc")) {
			
			
			System.out.println("Test case Pass");
		}
		else
		{
			
			System.out.println("Test case Fail");
		}
	}

	public void addcart() {

		addcart.click();
	}
	
	

}
