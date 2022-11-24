package Test_Cases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;

public class Login_TC2 extends Base_Test{
	
	@DataProvider(name = "logindata")
	public Object[][] testdata() throws IOException{
		Object[][] data= Utility_Methods.getTestData("Login");
		//data[0][0]="Sanku123@gmail.com";
		//data[0][1]="Sanku@12345";
		//	return data;
		return data;
	
	}

	
	@Test(dataProvider = "logindata")
	public void TC2(String emailid, String password) throws InterruptedException{
		
		WebElement login_link= driver.findElement(By.className("ico-login"));
		Utility_Methods.click_Element(login_link);
	
		
		//driver.findElement(By.id("Email")).sendKeys("Sangapur123@gmail.com");
		WebElement Email=driver.findElement(By.id("Email"));
		//Entervalue_In_Editfield(Email, "Sangapur123@gmail.com");
		Utility_Methods.Entervalue_In_Editfield(Email, emailid);
		
		
		//driver.findElement(By.id("Password")).sendKeys("s@123456789");
		WebElement password_button=driver.findElement(By.id("Password"));
		//Entervalue_In_Editfield(password, "s@123456789");
		Utility_Methods.Entervalue_In_Editfield(password_button, password);
		
		WebElement checkbox=driver.findElement(By.id("RememberMe"));
		Utility_Methods.click_Element(checkbox);
		
		
		WebElement subbmit_button=driver.findElement(By.xpath("//input[@value=\"Log in\"]"));
		Utility_Methods.click_Element(subbmit_button);
		
		WebElement logout=driver.findElement(By.xpath("//a[text()='Log out']"));
		Utility_Methods.click_Element(logout);
	
	}
	
}