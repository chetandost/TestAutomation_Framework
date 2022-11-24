package pom_testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import pom_pages.DWS_HomePage;
import pom_pages.DWS_RegisterPage;

public class DWS_Register_Test extends Base_Test{
	
	@DataProvider(name = "Register_testdata")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("Register");
		return data;
	}
	
	
	@Test(dataProvider = "Register_testdata")
	public void TC01(String firstname,String lastname,String email,String password,String Confirmpassword) {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.Click_Register();
				
		DWS_RegisterPage rp=new DWS_RegisterPage(driver);
		
	rp.Click_genderradio_button();
	rp.Enter_first_name(firstname);
	rp.Enter_last_name(lastname);
	rp.Enter_email_Id(email);
	rp.Enter_password(Confirmpassword);
	rp.Enter_confirm_password(Confirmpassword);
	rp.Click_Confirm_register_button();
	
	
	}

}
