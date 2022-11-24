package pom_testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import pom_pages.DWS_HomePage;
import pom_pages.DWS_Jewellery_Page;

public class DWS_Jewellery_Test extends Base_Test{
	
	@DataProvider(name="DWS_Jewellery")
    public Object [][] test_Jewellery() throws IOException{
		
		Object[][] data=Utility_Methods.getTestData("Jewellery");
		
		return data;
		
	}
	
	@Test(dataProvider= "DWS_Jewellery")
	public void TC07(String sortby,String display,String viewas) {
		
		DWS_HomePage hp = new DWS_HomePage(driver);
		hp.click_jewllery();
		
		DWS_Jewellery_Page  jew = new DWS_Jewellery_Page(driver);
		jew.sortby(sortby);
		jew.display_dropdown(display);
		jew.View_as(viewas);
		
		jew.click_prduct();
		jew.addTo_Cart_btn();
		
		
	}
	
	
}

