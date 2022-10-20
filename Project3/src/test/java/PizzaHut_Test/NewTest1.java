package PizzaHut_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page_object.WebElements;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest1 {
	
	WebDriver driver=null;
	
	@BeforeMethod()
	public void BeforeMethod() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-geolocation");
		driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.pizzahut.co.in/");
		
		WebElement sel = driver.findElement(By.xpath("(//input[@type='text'])"));
		sel.sendKeys("jnmc");
		Thread.sleep(3000);
		sel.sendKeys(Keys.ENTER);
		
	}
  
	@Test
	public void f() 
	{
//			WebElements w=new WebElements(driver);
//			w.voucher();
//			w.click_code("HUT125");
//			w.click_redeem();
//			w.click_ok();
//			w.click_on_pizza();
//			
	}
}
