package pom_testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import pom_pages.DWS_Digital_DownloadsPage;
import pom_pages.DWS_HomePage;

public class DWS_Digital_DownloadsTest extends Base_Test{
	
	@DataProvider(name="DWS_Digital_Downloads")
    public Object [][] testDigitalDownloads() throws IOException{
		
		Object[][] data=Utility_Methods.getTestData("Digital_Downloads");
		
		return data;
		
	}
	
	@Test(dataProvider= "DWS_Digital_Downloads")
	public void TC08(String sortby,String display,String viewas) {
		
		DWS_HomePage hp= new DWS_HomePage(driver);
		hp.click_Digital_downloads();
		
		DWS_Digital_DownloadsPage ddp = new DWS_Digital_DownloadsPage(driver);
		ddp.sortby(sortby);
		ddp.display_dropdown(display);
		ddp.View_as(viewas);
		ddp.addTo_Cart_btn();
		
		
	}

}