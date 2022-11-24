package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_RegisterPage extends Utility_Methods {
	
	//constructor-to initalize the drriver instance and webelement
		public DWS_RegisterPage (WebDriver driver) {
			PageFactory.initElements(driver, this);
			}
		
		//WebElement 
		
		@FindBy(id="gender-male")
		WebElement GenderRadio_button;
		
		@FindBy(id="FirstName")
		WebElement firstname;
		
		
		@FindBy(id="LastName")
		WebElement lastname;
		
		@FindBy(id="Email")
		WebElement email;
		
		@FindBy(id="Password")
		WebElement password;
		
		@FindBy(id="ConfirmPassword")
		WebElement confirmpassElement;
		
		@FindBy(xpath = "//input[@id='register-button']")
		WebElement ConfirmRegister_button;
		
		
		//methods
		public void Click_genderradio_button(){
			click_Element(GenderRadio_button);
		}
		public void Enter_first_name(String value) {
			Entervalue_In_Editfield(GenderRadio_button, value);
		}
		
		public void Enter_last_name(String value) {
			Entervalue_In_Editfield(lastname, value);
		}
		
		public void Enter_email_Id(String value) {
			Entervalue_In_Editfield(email, value);
		}
		
		public void Enter_password(String value) {
			Entervalue_In_Editfield(password, value);
		}
		
		public void Enter_confirm_password(String value) {
			Entervalue_In_Editfield(confirmpassElement, value);
		}
		
		public void Click_Confirm_register_button() {
			click_Element(ConfirmRegister_button);
		}

}