package testNG_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Register {
	
	@DataProvider(name = "testdata")
		public Object[][] testdata(){
			Object[][] data=new Object[5][5];
			data[0][0]="Sankalp";
			data[0][1]="Sangapur";
			data[0][2]="Sanku123@gmail.com";
			data[0][3]="Sanku@12345";
			data[0][4]="Sanku@12345";
			
			data[1][0]="chetu";
			data[1][1]="cc";
			data[1][2]="ccsc@gmail.com";
			data[1][3]="cc@12345";
			data[1][4]="cc@12345";
			
			data[2][0]="San";
			data[2][1]="Sank";
			data[2][2]="Sanku1234@gmail.com";
			data[2][3]="Sanku@123456";
			data[2][4]="Sanku@123456";
			
			data[3][0]="Sama";
			data[3][1]="Samuu";
			data[3][2]="Sanku12345@gmail.com";
			data[3][3]="Sanku@1234567";
			data[3][4]="Sanku@1234567";
			
			data[4][0]="raja";
			data[4][1]="raaju";
			data[4][2]="raju1234@gmail.com";
			data[4][3]="raju@123456";
			data[4][4]="raju@123456";
			
			return data;		
		}
	
	
	@Test (dataProvider="testdata")
	public void TC1(String Firstname,String Lastname,String Email, String password,String Confirmpassword){
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		driver.findElement(By.className("ico-register")).click();
		//driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(Firstname);
		driver.findElement(By.id("LastName")).sendKeys(Lastname);
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Confirmpassword);
		driver.findElement(By.id("register-button")).click();
		}
	
	WebElement element;
}

