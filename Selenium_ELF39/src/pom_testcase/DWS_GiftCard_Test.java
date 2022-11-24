package pom_testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import pom_pages.DWS_GiftCard_Page;
import pom_pages.DWS_HomePage;

public class DWS_GiftCard_Test extends Base_Test{
	
@DataProvider(name = "DWS_GiftCard")
	
	public Object [][] testtest_Gift_Card() throws IOException{
			
			Object[][] data=Utility_Methods.getTestData("Gift_Card");
			
			return data;
		}
		
		
	@Test(dataProvider= "DWS_GiftCard")
	public void TC06(String sortby,String display,String viewas) {
		
		DWS_HomePage hp = new DWS_HomePage(driver);
		hp.Click_Gift_Cards();
		
		DWS_GiftCard_Page  gift = new DWS_GiftCard_Page(driver);
		gift.sortby(sortby);
		gift.display_dropdown(display);
		gift.View_as(viewas);
		
		gift.click_prduct();
		gift.addTo_Cart_btn();
		
		
	}
}