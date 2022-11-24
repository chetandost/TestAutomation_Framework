package selenium_basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_Login {
	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("sankalpsan12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("s@7795224447");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
		
		//taking screenshot
			TakesScreenshot tss=(TakesScreenshot)driver;  //typecasting
			File loginpage=tss.getScreenshotAs(OutputType.FILE);
			
			File destination=new File("./screenshot/screenshot.png");
			FileHandler.copy(loginpage, destination);
			
			driver.close();
			
			
		
		
	}

}
