package pom_testcase;

import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import pom_pages.DWS_ComputersPage;
import pom_pages.DWS_HomePage;

public class DWS_ComputersTest extends Base_Test {
		
	@Test
	public void TC06() {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_computers_button();
		
		
		DWS_ComputersPage cp=new DWS_ComputersPage(driver);
		cp.Click_desktop_button();
	}

}
