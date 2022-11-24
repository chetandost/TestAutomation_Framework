package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_FireFoxBrowser {
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	//launch wikipedia
	driver.get("https://www.wikipedia.org/");
	
	//launch twitter login page
	driver.get("https://twitter.com/");
	
	//launch irctc web
	driver.get("https://www.irctc.co.in/nget/train-search");
	
}
}
