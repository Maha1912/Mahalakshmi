package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ram {
	WebDriver driver;
	
	@BeforeClass
	
 public void facebook() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}
		@Test()
		public void launch() {
		
		driver.get("http:\\www.facebook.com");
	}
		       @Test()
 public void login() {		       
		driver.findElement(By.id("email")).sendKeys("ram@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
			}
	

@AfterClass
public void close() {
	driver.close();
}
}
		


