package Flipkart_elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page
{
	
	

		public Login_page(WebDriver driver) {
			PageFactory.initElements(driver,this);
	}


		@FindBy(xpath="(//input[@type='text'])[2]")
		WebElement emailTextBox;

		@FindBy(xpath="(//input[@type='password'])")
		WebElement passwordTextBox;
		
		@FindBy(xpath="(//button[@type='submit'])[2]")
		WebElement loginTextBox;
		
		
		public void username(String username) {
           emailTextBox.sendKeys(username);
		}
		
		public void password(String password) {
			passwordTextBox.sendKeys(password);
		}
		
		public void loginclick(){
			loginTextBox.click();
		}

		
}
