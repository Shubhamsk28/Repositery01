package Assignments;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipckart 
{

	WebDriver driver;
	@Test()
	public void Test1() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.flipkart.com/'");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		js.executeScript("arguments[0].value='7090214343';",driver.findElement(By.xpath("(//input[@type='text'])[2]")));
		js.executeScript("arguments[0].value='Shubh@m28';",driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")));

		
		String actual = "Please enter valid Email ID/Mobile number";
		
		
		if (driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/span[2]/span")).getText().equals(actual))
		{
			System.out.println("User is not able to enter on home page");
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);        
		    String homeDir = System.getProperty("user.dir");        
		    FileUtils.copyFile(scrFile, new File(homeDir + "/screenshots/" +System.currentTimeMillis() + ".png"));
		       
		} else {
			System.out.println("User able to home page ");
		}  
	}
}
