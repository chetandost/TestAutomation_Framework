package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_BrowsersMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//launch the chrome browser
		WebDriver driver=new ChromeDriver();
	
		//navigate to browser
		
		driver.get("https://www.google.co.in");
		
		//navigate to testyantra browser
		driver.get("https://webmail.testyantra.in/");

	
	}

}