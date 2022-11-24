package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Monter {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		
		//Identify the WebElement and mouseover
		WebElement job=driver.findElement(By.xpath("//a[@href=\"https://www.monsterindia.com/search/job-search\"]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(job).build().perform();
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Jobs by Skills')])[1]"))).click().build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[@href=\"https://www.monsterindia.com/search/java-jobs\"]"))).click().perform();
	}
}