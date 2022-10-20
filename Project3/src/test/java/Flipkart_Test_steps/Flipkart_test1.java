package Flipkart_Test_steps;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Flipkart_elements.Homepage_Elements;
import Flipkart_elements.Login_page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_test1 
{
	static WebDriver driver;
	static Homepage_Elements Homepage;
	static Login_page Login;
	
	
	//Test senario 1
	@Test
	@Before
	public void before()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	@Given("^user is able to enter the username$")
	public void test1()
	{
		Login_page L = new Login_page(driver);
		L.username("7090214343");
		System.out.println("user is able to enter the username");
	}
	
	@Test
	@And ("^user is able to enter the password$")
	public void test2()
	{
		Login_page L=new Login_page(driver);
		L.password("Shubh@m28");
		System.out.println("user is able to enter the password");
	}
	
	@Test
	@Then ("^user is click on login page$")
	public void test3() throws InterruptedException
	{
		Login_page L=new Login_page(driver);
		L.loginclick();
		System.out.println("user is click on login page");
		
		String actual=driver.getCurrentUrl();
		String expected="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		Assert.assertEquals(actual,expected);  
//		if () {
			
//		}
	}
	
	//Test Senario 2
	@Test
	@Given("^user is able to enter the username and password$")
	public void user_is_able_to_enter_the_username_and_passwprd() {
	   Login=new Login_page(driver);
	   Login.username("7090214343");
	   Login.password("Shubh@m28");
	}
	
	@Test
	@When("user click on login page")
	public void user_click_on_login_page()
	{
		Login=new Login_page(driver);
		Login.loginclick();
	}

	@Test
	@And("user is on home page and verify the title")
	public void user_is_on_home_page() {
		System.out.println("user is on home page");
		
	}

	@Test
	@When("user click on To offers")
	public void user_click_on_to_offers() {
		
		Homepage=new Homepage_Elements(driver);
		Homepage.topoffers();
	}
	
	@Test
	@Then("user is on offeers page")
	public void user_is_in_to_offeers_page() {
	    System.out.println("user is on offeers page");
	}
	
	
	
	@Test
	@After
	public void after() throws IOException
	{
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);        
	    String homeDir = System.getProperty("user.dir");        
	    FileUtils.copyFile(scrFile, new File(homeDir + "/screenshots/" +System.currentTimeMillis() + ".png"));
	       
//	    driver.close();
	}
}
