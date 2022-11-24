package Test_Cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;

public class Register_TC extends Base_Test {
	
	@DataProvider(name = "testdata")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("Register");
		//data[0][0]="Sankalp";
		//data[0][1]="Sangapur";
		//data[0][2]="Sanku123@gmail.com";
		//data[0][3]="Sanku@12345";
		//data[0][4]="Sanku@12345";
		return data;		
	}
	
	
	
	@Test(dataProvider = "testdata")
	public void TC1(String Firstname,String Lastname,String Email, String password,String Confirmpassword){
		WebElement click_register_link=driver.findElement(By.className("ico-register"));
		Utility_Methods.click_Element(click_register_link);	
		
		WebElement click_genderradio_button=driver.findElement(By.id("gender-male"));
		Utility_Methods.click_Element(click_genderradio_button);
	
		WebElement send_firstname=driver.findElement(By.id("FirstName"));
		Utility_Methods.Entervalue_In_Editfield(send_firstname, Firstname);
		
		
		WebElement send_lasttname=driver.findElement(By.id("LastName"));
		Utility_Methods.Entervalue_In_Editfield(send_lasttname, Lastname);
		
		WebElement send_email=driver.findElement(By.id("Email"));
		Utility_Methods.Entervalue_In_Editfield(send_email, Email);

		WebElement send_password=driver.findElement(By.id("Password"));
		Utility_Methods.Entervalue_In_Editfield(send_password, password);
		
		WebElement send_confirmpassword=driver.findElement(By.id("ConfirmPassword"));
		Utility_Methods.Entervalue_In_Editfield(send_confirmpassword, Confirmpassword);
		
		WebElement click_registerbutton=driver.findElement(By.id("register-button"));
		Utility_Methods.click_Element(click_registerbutton);
		
		}
	

}