package testlayer;
import org.testng.annotations.Test;

import baselayer.base_page;
import pagelayer.flipkart_login;

import org.openqa.selenium.support.PageFactory;
import baselayer.base_page;
import pages.Flipkart_Login;
public class flipkart_logintest extends base_page {
	@Test
	public void init() throws Exception {
	flipkart_login loginpage =PageFactory.initElements(driver,flipkart_login.class);
	loginpage.setEmail("abc@gmail.com");
	loginpage.setPassword("abcdef");
	//loginpage.clickLoginButton();
	}
	}
	
	 
