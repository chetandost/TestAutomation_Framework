package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Method {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver check=new ChromeDriver();
		
		//launch browser
		check.get("https://demowebshop.tricentis.com/register");
		check.manage().window().maximize();
		
		//locator linktext
		check.findElement(By.linkText("Register")).click();

		
		
		//check.close(); 
		//check.quit();
		
		
	}

}
