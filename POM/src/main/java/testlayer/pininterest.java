package testlayer;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
	public class pininterest extends Baseclass {
		@Test(dataProvider = "Credentials1")
		public void loginTest(String username,String password) {
System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
driver = new ChromeDriver();
 driver.get("https://www.pinterest.com/");
driver.findElement(By.id("email")).sendKeys(username);
driver.findElement(By.id("password")).sendKeys(password);
driver.findElement(By.name("zI7 iyn Hsu")).click();
	String actualURL=driver.getCurrentUrl();
	String expectedURL="https://www.pinterest.com/"; AssertJUnit.assertEquals(actualURL, expectedURL);
				}
				}
	 {
		// TODO Auto-generated method stub

	}

}
