import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NewTest_1 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",  "E:\\chromedriver_win32/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		//name
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("Danie");
		
		//email
		WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("daniel@gmail.com");
		
		//mobile
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9999000088");
		
		
		//password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Master@33");
		
		//button
		WebElement register= driver.findElement(By.cssSelector("#registerButton"));
		Thread.sleep(20000);
		register.click();
		Thread.sleep(20000);
		
	}

}
