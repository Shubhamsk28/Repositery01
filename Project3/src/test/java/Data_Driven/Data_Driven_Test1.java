package Data_Driven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Driven_Test1 
{
	WebDriver driver=null;
	
	@Test
	public void Test1()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-geolocation");
		driver=new ChromeDriver(options);
		
		//Launch the browser
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
//		File file=new File(System.getProperty("user.dir")+"\\TestData\\"+ );
		
		
	}
}
