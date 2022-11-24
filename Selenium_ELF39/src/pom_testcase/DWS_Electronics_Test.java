package pom_testcase;

import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import pom_pages.DWS_HomePage;

public class DWS_Electronics_Test extends Base_Test {
	
	@Test
	public void TC12() {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_electronics();
	}

}
