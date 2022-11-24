package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_HomePage {
	
	//constructor-to initalize the drriver instance and webelement
	public DWS_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	
	@FindBy(className="cart-label")
	WebElement Shoppingcart_link;
	
	@FindBy(className = "class=\"cart-label\"")
	WebElement Wishlist_link;
	
	@FindBy(className ="ico-register")
	WebElement Register_link;
	
	@FindBy(className ="ico-login")
	WebElement Login_Link;
	
	@FindBy(id="small-searchterms")
	WebElement Search_textfield;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement Search_button;
	
	@FindBy(xpath = "(//a[@href=\"/computers\"])[1]")
	WebElement computers_button;
	
	@FindBy(xpath = "//a[@href=\"/computers\"]")
	WebElement Computer_button;
	
	@FindBy(xpath = "(//a[contains(text(),'Apparel & Shoes')])[1]")
	WebElement Apparel_And_Shoes ;
	
	@FindBy(xpath = "(//a[contains(text(),'Digital downloads')])[1]")
	WebElement Digital_downloads ;
	
	@FindBy(xpath = "(//a[contains(text(),'Gift Cards')])[1]")
	WebElement Gift_Cards ;
	
	@FindBy(xpath="(//a[@href='/cart'])[1]")
    WebElement click_cart; 
	
	@FindBy(xpath = "(//a[@href='/jewelry'])[1]")
	WebElement click_jewllery;
	
	//WebElement
	@FindBy(xpath = "(//a[@href=\"/books\"])[1]")
	WebElement click_Books;
		
	@FindBy(xpath = "//a[@href=\"/contactus\"]")
	WebElement click_contact;
	
	@FindBy(xpath = "//input[@id=\"pollanswers-3\"]")
	WebElement click_radio_btn;
	
	@FindBy(xpath = "//input[@class=\"button-2 vote-poll-button\"]")
	WebElement click_vote_btn;
	
	@FindBy (xpath="(//a[@href='/electronics'])[1]")
	WebElement click_electronics;
	
	
	
	
	
	//Method
	public void Click_Login() {
		Login_Link.click();
	}
	
	public void Click_Register() {
		Register_link.click();
	}
	
	public void Click_Shoppingcart() {
		Shoppingcart_link.click();
	}
	
	public void Click_Wishlist() {
		Wishlist_link.click();
	}
	
	public void Enter_Search_textfield(String value) {
		Search_textfield.sendKeys(value);
	}
	
	public void click_Search_button() {
		Search_button.click();
	}
	
	public void click_computers_button() {
		computers_button.click();
	}
	
	
	
	public void click_Apparel_And_Shoes() {
		Utility_Methods.click_Element(Apparel_And_Shoes);
	}
	
	public void click_Digital_downloads() {
		Utility_Methods.click_Element(Digital_downloads);
	}
	public void Click_Gift_Cards() {
		Utility_Methods.click_Element(Gift_Cards);
	}
	
	public void click_shopping_cart() {
		Utility_Methods.click_Element(click_cart);
		}
	
	public void click_jewllery() {
		Utility_Methods.click_Element(click_jewllery);
	}
		
	public void click_Books() {
		Utility_Methods.click_Element(click_Books);
	}
	
	public void click_contactus() {
		Utility_Methods.click_Element(click_contact);
	}
	
	public void click_radio_btn() {
		Utility_Methods.click_Element(click_radio_btn);
	}
	
	public void click_vote_btn() {
		Utility_Methods.click_Element(click_vote_btn);
	}
	
	public void click_electronics() {
		Utility_Methods.click_Element(click_electronics);
	}
	
	
	
}
