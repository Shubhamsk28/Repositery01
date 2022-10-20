package Package3;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScripExecuterTest 
{
	
	WebDriver driver;
	@Test()
	public void Test1() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.location='https://mail.rediff.com/cgi-bin/login.cgi'");
		driver.manage().window().maximize();
		
		
		
//		js.executeScript("window.setTimeout(function(){alert('Shubham');},1000)");
//		
//		js.executeScript("arguments[0].value='1234';",driver.findElement(By.xpath("//input[@type='text']")));
//		js.executeScript("document.getElementById('password').value='24'");
//		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//input[@name='proceed']")));
//		
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].checked='True'",driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")));
		js.executeScript("arguments[0].checked='false'",driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")));
		takescreenshot(driver,"img2");
	}
	
	public void takescreenshot(WebDriver driver,String ss) throws IOException
	{
		String filepath="C:\\Users\\SSIDRAIK\\eclipse-workspace\\Project3\\ScreenShot\\";
		
		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenShot, new File(filepath + ss + ".png"));
		
		
	}
}
