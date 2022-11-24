package selenium_basics;	//launch browser-naviagte to demoworkshop enter computer and search

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Locator {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]")).sendKeys("Computer");
		driver.findElement(By.cssSelector("input[value=\"Search\"]")).click();
		
		

	}

}
