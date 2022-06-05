package pagelayer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class flipkart_login {
	WebDriver driver;

	 public void Flipkart_Login(WebDriver driver) {
		 this.driver = driver;
	 }

	 // Using FindBy for locating elements
	 @FindBy(how = How.XPATH, using = "//div[@class='IiD88i_351hSN']//input[@type='text']")
	 WebElement emailTextBox;

	 @FindBy(how = How.XPATH, using ="//input[@type='password']")
	WebElement passwordTextBox;

	 @FindBy(how = How.XPATH, using
	="//div[@class='_1D1L_j']//button[@type='submit']")
	 WebElement loginButton;

	 // Defining all the user actions (Methods)

	 // This method is to set Email in the email text box
	 public void setEmail(String strEmail) {
	 emailTextBox.sendKeys(strEmail);
	 }

	 // This method is to set Password in the password text box
	 public void setPassword(String strPassword) {
	 passwordTextBox.sendKeys(strPassword);
	 }

	

}
