package Selenium_Assignment;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class EndToEnd_PracticePage {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		driver.findElement(By.xpath("(//div[text()='India'])[1]")).click();
		
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("Option1");
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0 ; i<=checkbox.size()-1;i++) {
			checkbox.get(i).click();
		} 
		
		
		//Window handel
		//make a note of parent window
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		
		//identify the childwindow
		driver.findElement(By.id("openwindow")).click();
		
		Set<String>total_window=driver.getWindowHandles();
		System.out.println(total_window);
		
		for(String child_window:total_window) {
			driver.switchTo().window(child_window);
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().equalsIgnoreCase("QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy")) {
				Thread.sleep(2000);
				driver.close();
			}
			}
		
		driver.switchTo().window(parent_window);
		
		//identify  the 2nd child window
		driver.findElement(By.xpath("//a[@id=\"opentab\"]")).click();
		
		Set<String>window=driver.getWindowHandles();
		System.out.println(window);
		
		for(String child_window1:window) {
			driver.switchTo().window(child_window1);
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().equalsIgnoreCase("Rahul Shetty Academy")) {
				driver.close();
			}
		}
		
		driver.switchTo().window(parent_window);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("San");
		
		Actions action =new Actions(driver);
		WebElement click=driver.findElement(By.id("alertbtn"));
		Thread.sleep(2000);
		action.doubleClick(click).build().perform();
		
		Alert ale=driver.switchTo().alert();
		ale.accept();
		
		driver.switchTo().window(parent_window);
		
		
		 //Dependent x-path
		//driver.findElement(By.xpath("(//td[text()='30'])[2]/../td[3]")).click();
	

		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click(); // to hide 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='show-textbox']")).click();  // to show
		
		
		
		action.sendKeys(Keys.PAGE_DOWN).perform();
			
 WebElement mouse =driver.findElement(By.xpath("//button[@id='mousehover']"));
 Thread.sleep(2000);
 
		//mouse over action
		action.moveToElement(mouse).build().perform();
		//WebElement moveto=driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
		//action.moveToElement(moveto).build().perform();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Top']"))).click().build().perform();
		
	//	action.moveToElement(driver.findElement(By.xpath("//a[text()='Reload']"))).click().build().perform();
		
		
		
		
		
		
		
		

		/*Actions action=new Actions(driver);
		action.moveToElement(job).build().perform();
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Jobs by Skills')])[1]"))).click().build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[@href=\"https://www.monsterindia.com/search/java-jobs\"]"))).click().perform();
		*/
				
	
		
		
		
		
			
			
		}
	}
			
			
			
			
			
		
	
		
		
		

				
		
		
	
