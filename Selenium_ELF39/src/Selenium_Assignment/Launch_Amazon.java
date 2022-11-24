package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch_Amazon {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.primevideo.com/?ref_=dvm_pds_amz_in_as_s_g_brand28&ext_vrnc=hi|c_386559716838_m_fQQR2NKb-dc_s_");
		driver.manage().window().maximize();
		WebElement Cat=driver.findElement(By.className("pv-nav-main-menu-subdropdown-text"));
		
		Actions action =new Actions(driver);
		action.moveToElement(Cat).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'English')])[2]"))).click().perform();
		
	}

}
