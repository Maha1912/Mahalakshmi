package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http:\\www.facebook.com");
driver.findElement(By.id("email")).sendKeys("ram@gmail.com");
driver.findElement(By.id("pass")).sendKeys("1234");
driver.findElement(By.name("login")).click();
	}

}
