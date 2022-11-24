package testNG_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parameters {
	

	@org.testng.annotations.Parameters({"URL","product"})
	@Test
	public void parallelsearch(String webpage,String search) {
		System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(webpage);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("small-searchterms")).sendKeys(search);
		driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		driver.close();
	}


}
