package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_Books_Page extends Utility_Methods {
	
	//constructor
	public DWS_Books_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//select[@id=\"products-orderby\"]")
	WebElement click_sortby;
	
	@FindBy(xpath = "//select[@id=\"products-pagesize\"]")
	WebElement click_display;
	
	@FindBy(xpath = "//select[@id=\"products-viewmode\"]")
	WebElement click_view;
	
	@FindBy(xpath = "(//input[@class=\"button-2 product-box-add-to-cart-button\"])[1]")
	WebElement click_addtocart_btn;
	
	//methods
	public void click_sortby() {
		click_Element(click_sortby);
	}
	
	public void click_display() {
		click_Element(click_display);
	}
	
	public void click_view() {
		click_Element(click_view);
	}
	
	public void click_addtocart_btn() {
		click_Element(click_addtocart_btn);
	}
	
	

}
