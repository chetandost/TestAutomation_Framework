package testNG_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider_5testcase {
@DataProvider(name="register")
	
	public Object[]testdata(){
		
		Object[][]data=new Object[1][5];
		
		data[0][0]="Sanku";
		data[0][1]="Sangapur";
		data[0][2]="Sanku123@gmail.com";
		data[0][3]="Sanku@12345";
		data[0][4]="Sanku@12345";
		return data;
	}
	
	@Test(dataProvider="register",priority=1)
	
	public void demo(String firstname, String lastname, String email, String password, String confirmpassword ) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys(confirmpassword);
		driver.findElement(By.xpath("//input[@id=\"register-button\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"button\"][1]")).click();
		
		driver.close();
	}
	
	@DataProvider(name="login")
	
	public Object[]testlog(){
		
		Object[][]data=new Object[1][2];
		
		data[0][0]="chetanmkumar92@gmail.com";
		data[0][1]="chetan12";
			return data;
	}
	
	@Test(dataProvider="login",priority=2)
	public void demo(String Email, String Password) {
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(Email);
		
		driver.findElement(By.id("Password")).sendKeys(Password);
		
		driver.findElement(By.id("RememberMe")).click();
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
		
		driver.close();
	}
	
	@DataProvider(name="search")
	
	public Object[]testsearch(){
		
		Object[][]data=new Object[1][1];
		
		data[0][0]="computers";
		
		return data;
	}
	@Test(dataProvider="search",priority=3)
	
	public void demo(String search) {
		
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys(search);
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		driver.close();
	
	}
	
	@DataProvider(name="advancesearch")
	
	public Object[]testadvancesearch(){
		
		Object[][]data=new Object[1][3];
		
		data[0][0]="computers";
		data[0][1]="1000";
		data[0][2]="90000";
		
		return data;
	}
	@Test(dataProvider="advancesearch",priority=4)
	
	public void demo(String search, String from, String to ) {
		
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys(search);
	
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	
	driver.findElement(By.xpath("//input[@id=\'As\']")).click();
	
	WebElement category=driver.findElement(By.id("Cid"));
	
	Select sel=new Select(category);
	
	sel.selectByVisibleText("Computers");
	
	driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
	
	WebElement mfr=driver.findElement(By.id("Mid"));
	
	Select sel1=new Select(mfr);
	
	sel1.selectByVisibleText("Tricentis");
	
	driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys(from);
	
	driver.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys(to);
	
	driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]")).click();
	
	driver.close();
	
	}
	
	
	@Test
	
	public void demo() {
		
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	Actions action=new Actions(driver);
	
	WebElement mouse_hover=driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
	
	action.moveToElement(mouse_hover).build().perform();
	
	driver.findElement(By.xpath("(//a[@href=\"/accessories\"])[1]")).click();
	
	driver.close();
	
	}}

}
