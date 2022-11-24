package PracticeFrramework_Flipkart;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Framework_Utility.Utility_Methods;

public class Flipkart_Basetest {
	
public WebDriver driver;
	
	@BeforeClass
	public void Browsersetup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		String url=Utility_Methods.Test_configuration();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void Turndown() {
		driver.quit();
	}

}
