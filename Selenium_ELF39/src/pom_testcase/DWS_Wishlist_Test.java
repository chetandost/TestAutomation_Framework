package pom_testcase;

import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import pom_pages.DWS_HomePage;

public class DWS_Wishlist_Test extends Base_Test {
	
	@Test
	public void TC05() {
		
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.Click_Login();
		}
}
