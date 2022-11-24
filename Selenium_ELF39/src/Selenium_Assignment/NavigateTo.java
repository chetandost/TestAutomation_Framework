package Selenium_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver check=new ChromeDriver();
	
		check.navigate().to("https://webmail.testyantra.in/");
		check.manage().window().maximize();
		
		
		
		check.navigate().to("https://www.udemy.com/join/login-popup/");
		check.manage().window().maximize();		//to maximize to window
		check.navigate().back();				//to navigate back	
		check.navigate().forward();				//to naviagte forward
		check.navigate().refresh();				//to refresh the page
		
		//check.close();							//to close the chrome
	
	}

}
