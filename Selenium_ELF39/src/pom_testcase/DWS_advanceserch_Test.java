package pom_testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import pom_pages.DWS_HomePage;
import pom_pages.DWS_advanvceserachPage;

public class DWS_advanceserch_Test extends Base_Test {
	
	@DataProvider(name = "testdata")
	public Object[][]advanceserach() throws IOException{
		Object[][] data=Utility_Methods.getTestData("advanceSearch");
		return data;
	}
	

	@Test(dataProvider = "testdata")
	public void TC10(String searchvalue, String category_value,String manufacture_value,String from_value,String to_value) {
		
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.Enter_Search_textfield(searchvalue);
		hp.click_Search_button();
		
		
		DWS_advanvceserachPage as = new DWS_advanvceserachPage(driver);
		
		as.click_advancesearch_checkbox();
		as.Click_Categorydropdown_button(category_value);
		as.Click_Manufacturerdropdown_button(manufacture_value);
		as.Enter_from_textfield(from_value);
		as.Enter_to_textfield(to_value);
		as.click_finalsearch_button();

		}
}