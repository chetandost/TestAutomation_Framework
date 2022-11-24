package Flipkart_TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Utility_Methods;
import PracticeFrramework_Flipkart.Flipkart_Basetest;
import PracticeFrramework_Flipkart.Flipkart_UtilityMethod;

public class Addtocartphone_Flipkart extends Flipkart_Basetest{
	
	
	@DataProvider(name = "logindata")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("login");
		
		return data;		
	}

	@Test(dataProvider = "logindata")
	public void TC2(String emailid, String password) throws IOException{
		
		Flipkart_UtilityMethod.click_Element(driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")));
		WebElement login_link= driver.findElement(By.xpath("//a[text()=\"Login\"]"));
		Flipkart_UtilityMethod.click_Element(login_link);

		
		//driver.findElement(By.id("Email")).sendKeys("Sangapur123@gmail.com");
		WebElement Email=driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		//Entervalue_In_Editfield(Email, "Sangapur123@gmail.com");
		Flipkart_UtilityMethod.Entervalue_In_Editfield(Email, emailid);
		
		
		//driver.findElement(By.id("Password")).sendKeys("s@123456789");
		WebElement password_button=driver.findElement(By.xpath("(//input[@type=\"password\"])"));
		//Entervalue_In_Editfield(password, "s@123456789");
		Flipkart_UtilityMethod.	Entervalue_In_Editfield(password_button, password);
		
		WebElement subbmit_button=driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
		Utility_Methods.click_Element(subbmit_button);	

		
		Flipkart_UtilityMethod.click_Element(driver.findElement(By.xpath("//img[@alt=\"Mobiles\"]")));
		Flipkart_UtilityMethod.click_Element(driver.findElement(By.xpath("(//img[@class=\"_1aPR5_\"])[7]")));
		Flipkart_UtilityMethod.click_Element(driver.findElement(By.xpath("//div[@class=\"col col-7-12\"]")));
	}
	
}
