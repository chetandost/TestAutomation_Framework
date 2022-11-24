package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Framework_Utility.Utility_Methods;

public class DWS_ComputersPage extends Utility_Methods {
	

	
	//contructor
			public DWS_ComputersPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			
			
		//WebElemnent
			@FindBy(xpath = "//img[@alt=\"Picture for category Desktops\"]")
			WebElement desktop_button;

		//method
			public void Click_desktop_button() {
				click_Element(desktop_button);
			}
}
