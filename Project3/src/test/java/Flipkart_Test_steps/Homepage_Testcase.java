//package Flipkart_Test_steps;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.Test;
//
//import Flipkart_elements.Homepage_Elements;
//import Flipkart_elements.Login_page;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Homepage_Testcase 
//{
//	static WebDriver driver;
//	static Homepage_Elements Homepage;
//	static Login_page Login;
//	@Test
//	@Before
//	public void before()
//	{
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	}
//
//	@Test
//	@Given("user is able to enter the username and passwprd")
//	public void user_is_able_to_enter_the_username_and_passwprd() {
//	   Login=new Login_page(driver);
//	   Login.username("Shubham");
//	   Login.password("Shub@m123");
//	}
//	
//	@Test
//	@When("user click on login page")
//	public void user_click_on_login_page()
//	{
//		Login=new Login_page(driver);
//		Login.loginclick();
//	}
//
//	@Test
//	@And("user is on home page and verify the title")
//	public void user_is_on_home_page() {
//		
//	}
//
//	@Test
//	@When("user click on To offers")
//	public void user_click_on_to_offers() {
//		
//		Homepage=new Homepage_Elements(driver);
//		Homepage.topoffers();
//	}
//	
//	@Test
//	@Then("user is on offeers page")
//	public void user_is_in_to_offeers_page() {
//	    
//	}
//	
//	@AfterMethod
//	public void After() throws IOException
//	{
//
//		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);        
//	    String homeDir = System.getProperty("user.dir");        
//	    FileUtils.copyFile(scrFile, new File(homeDir + "/screenshots/" +System.currentTimeMillis() + ".png"));
//	       
//	    driver.close();
//	}
//}
