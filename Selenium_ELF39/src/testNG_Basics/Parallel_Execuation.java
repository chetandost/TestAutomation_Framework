package testNG_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Execuation {
	
	@Test(invocationCount = 5,threadPoolSize = 4)
	public void  paralleldemo() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
		
	}

}
