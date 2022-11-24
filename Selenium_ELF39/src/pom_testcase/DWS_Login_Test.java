package pom_testcase;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Name;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import pom_pages.DWS_HomePage;
import pom_pages.DWS_LoginPage;

public class DWS_Login_Test extends Base_Test {
	@DataProvider(name="logintestdata")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("Login");
		return data;
	}
	
	
	@Test(dataProvider = "logintestdata")
	public void TC02(String emailid, String password) {
		
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.Click_Login();
		
		DWS_LoginPage lp=new DWS_LoginPage(driver);
		lp.Enter_username(emailid);
		lp.Enter_password(password);
		lp.Click_Login_button();
		lp.Click_logout_button();
	}

}
