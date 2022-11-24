package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_ContactUs_Page extends Utility_Methods {

		public   DWS_ContactUs_Page ( WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
		//webelement
		@FindBy(id = "FullName")
		WebElement textfeild;
	
		@FindBy(id = "Email")
		WebElement emailtext;
	
		@FindBy(id = "Enquiry")
		WebElement enquiry;
		
	    @FindBy(xpath = "//input[@name='send-email']")
	    WebElement submit;
	
	public void username(String name) {
		Utility_Methods.Entervalue_In_Editfield(textfeild, name);
	}
	
	public void email(String emailenter) {
		Utility_Methods.Entervalue_In_Editfield(emailtext,emailenter);
	}
	
	public void enquiry1(String enter) {
		Utility_Methods.Entervalue_In_Editfield(enquiry, enter);
	}
	public void clicksubmit() {
		submit.click();
	}
	
	}
