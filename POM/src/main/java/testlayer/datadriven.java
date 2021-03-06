package testlayer;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.util.Assert;
import baselayer.Baseclass;
public class datadriven extends Baseclass {
@Test(dataProvider = "Credentials1")
public void loginTest(String username,String password) {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.flickr.com/");
	driver.findElement(By.linkText("Log In")).click();
	driver.findElement(By.id("login-email")).sendKeys(username);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/button/span")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.id("login-password")).sendKeys(password);
driver.findElement(By.className("user-select-none")).click();
String actualURL=driver.getCurrentUrl();
String expectedURL="https://www.flickr.com/"; AssertJUnit.assertEquals(actualURL,
expectedURL);
}
}