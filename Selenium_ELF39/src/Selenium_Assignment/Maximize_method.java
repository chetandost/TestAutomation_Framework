package Selenium_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_method {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver check=new ChromeDriver();
		
		check.get("https://www.google.co.in"); 	//navigate to Google Browser
		check.manage().window().maximize();		//maximize the browser	
		
	}

}
