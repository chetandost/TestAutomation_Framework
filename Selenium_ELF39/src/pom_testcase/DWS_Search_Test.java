package pom_testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import pom_pages.DWS_HomePage;
import pom_pages.DWS_SearchPage;

public class DWS_Search_Test extends Base_Test{
	
	@DataProvider(name = "searchtestdata")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("Search");
		return data;
		
	}
	
	
	@Test(dataProvider = "searchtestdata")
	public void TC03(String Search) {
		DWS_SearchPage sp=new DWS_SearchPage(driver);
		sp.Enter_searchproduct_type(Search);
	
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_Search_button();
	
		
		
	}
	

}
