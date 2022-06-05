package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class facebook {
	WebDriver driver;
	

	@BeforeClass 
	public void facebook() 
	{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
driver = new ChromeDriver();
	}
@Test() 

public void launch() {

driver.get("https:\\www.facebook.com");
}
@Test()
public void login() {

driver.findElement(By.id("email")).sendKeys("12345@gmail.com");
driver.findElement(By.id("pass")).sendKeys("12345@gmail.com");
driver.findElement(By.name("login")).click();
}
//driver.findElement(By.linkText("Create New Account")).click();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//Select se = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
//se.selectByValue("1");

@AfterClass 
public void close() {
driver.close();
}
	}


