package pom_testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import pom_pages.DWS_Digital_DownloadsPage;
import pom_pages.DWS_HomePage;

public class DWS_Books_Test extends Base_Test {
	@DataProvider(name="DWS_Books")
    public Object [][] testDigitalDownloads() throws IOException{
		
		Object[][] data=Utility_Methods.getTestData("Books");
		
		return data;
	}
	
	@Test(dataProvider= "DWS_Books")
	public void TC09(String sortby,String display,String viewas) {
		
		DWS_HomePage hp= new DWS_HomePage(driver);
		hp.click_Books();
		
		DWS_Digital_DownloadsPage ddp = new DWS_Digital_DownloadsPage(driver);
		ddp.sortby(sortby);
		ddp.display_dropdown(display);
		ddp.View_as(viewas);
		ddp.addTo_Cart_btn();
		
	}

}