package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_LoginPage {
	
	//Constructor
	public DWS_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//WebElement
	@FindBy(id = "Email")
	WebElement userElement;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(xpath = "(//input[@type=\"submit\"])[2]")
	WebElement login_btn;
	
	@FindBy(xpath = "//a[@href=\"/logout\"]")
	WebElement logout_button;
	
	
	
	
	//Method
	public void Enter_username(String value) {
		userElement.sendKeys(value);
	}
	
	public void Enter_password(String value) {
		password.sendKeys(value);
		
	}
	
	public void Click_Login_button() {
		login_btn.click();
	}
	
	public void Click_logout_button() {
		logout_button.click();
	}
	
}