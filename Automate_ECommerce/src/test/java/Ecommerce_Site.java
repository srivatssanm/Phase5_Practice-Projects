import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Ecommerce_Site {
  @Test
  public void f() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement signin = driver.findElement(By.id("nav-signin-tooltip"));
		this.takeSnapShot(driver, "C:\\Users\\srias\\eclipse-workspace_2\\Automate_ECommerce\\src\\test\\java//out1.png") ;
		
		signin.click();
		driver.findElement(By.name("email")).sendKeys("9998987897");
		this.takeSnapShot(driver, "C:\\Users\\srias\\eclipse-workspace_2\\Automate_ECommerce\\src\\test\\java//out2.png") ;
		
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("Master@1234");
		this.takeSnapShot(driver, "C:\\Users\\srias\\eclipse-workspace_2\\Automate_ECommerce\\src\\test\\java//out3.png") ;
		
		driver.findElement(By.id("signInSubmit")).click();
		
		WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("boat 1200 bluetooth speaker");
		this.takeSnapShot(driver, "C:\\Users\\srias\\eclipse-workspace_2\\Automate_ECommerce\\src\\test\\java//out4.png") ;
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		this.takeSnapShot(driver, "C:\\Users\\srias\\eclipse-workspace_2\\Automate_ECommerce\\src\\test\\java//out5.png") ;
		
		driver.get("https://www.amazon.in/boAt-Bluetooth-Speaker-Battery-Feature/dp/B09TRW4619/ref=sr_1_1_sspa?crid=2ZNC03KBZ53B3&keywords=boat+1200+bluetooth+speaker&qid=1664951319&qu=eyJxc2MiOiIzLjEyIiwicXNhIjoiMi4zNiIsInFzcCI6IjIuMTAifQ%3D%3D&sprefix=Boat+1200%2Caps%2C313&sr=8-1-spons&psc=1");
		this.takeSnapShot(driver, "C:\\Users\\srias\\eclipse-workspace_2\\Automate_ECommerce\\src\\test\\java//out6.png") ;
		
		WebElement addtocart= driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		
		Thread.sleep(7000);
		this.takeSnapShot(driver, "C:\\Users\\srias\\eclipse-workspace_2\\Automate_ECommerce\\src\\test\\java//out7.png") ;
		
	}
	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	
		File DestFile=new File(fileWithPath);
		
		FileUtils.copyFile(SrcFile, DestFile);
		}
}