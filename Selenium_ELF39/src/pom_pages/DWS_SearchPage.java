package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_SearchPage extends Utility_Methods {
	//contructor
	public DWS_SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//WebElemnt
	@FindBy(xpath = "//input[@id=\"small-searchterms\"]")
	WebElement Enter_product;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement search_button;
	
	
	//Method
	public void Enter_searchproduct_type(String value) {
		Entervalue_In_Editfield(Enter_product, value);
	}
	
	public void Click_search_button() {
		click_Element(search_button);
	}
	
}