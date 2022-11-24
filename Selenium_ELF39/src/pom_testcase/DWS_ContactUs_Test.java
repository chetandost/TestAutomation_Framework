package pom_testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import pom_pages.DWS_ContactUs_Page;
import pom_pages.DWS_HomePage;

public class DWS_ContactUs_Test extends Base_Test {
	
	@DataProvider(name= "contact")
	public Object[][] view() throws IOException{
		Object[][] data= Utility_Methods.getTestData("Contact_us");
		return data;
	}

		@Test(dataProvider = "contact")
		public void test01(String view, String view1, String view2) {
			DWS_HomePage hp= new DWS_HomePage(driver);
			hp.click_contactus();
			
			DWS_ContactUs_Page cu= new DWS_ContactUs_Page(driver);
			
			cu.username(view);
			cu.email(view1);
			cu.enquiry1(view2);
			cu.clicksubmit();
            
	}

}
