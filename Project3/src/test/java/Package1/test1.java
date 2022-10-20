package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 
{
	WebDriver driver=null;
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-geolocation");
		driver=new ChromeDriver(options);
		
		//Launch the browser
		driver.manage().window().maximize();
		driver.get("https://www.pizzahut.co.in/");
		
		//It will select the location 
		WebElement sel = driver.findElement(By.xpath("(//input[@type='text'])"));
		sel.sendKeys("jnmc");
		Thread.sleep(3000);
		sel.sendKeys(Keys.ENTER);
		
	}
	
	// positive test case cart value greater than 500 rs
	@Test
	public void m1() throws InterruptedException
	{
		//click on voucher
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"basket\"]/div[1]/button/div/span[2]")).click();
		
		//apply coupon code
		driver.findElement(By.name("voucherId")).sendKeys("HUT125");
		
		//click on redeem
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		//click on OK
		driver.findElement(By.xpath("//button[@class='button button--green mb-10']")).click();
        Thread.sleep(3000);
        
        //click on pizza 
		driver.findElement(By.xpath("(//button[@class='button button--md button--green flex-1 font-semibold'])[2]")).click();
		Thread.sleep(5000);
		
		// validation of voucher code
		String actual = "Voucher applied! Rs. 125 Off on bill value above Rs.500.";
		
		
		if (driver.findElement(By.xpath("//*[@id=\"basket\"]/div[1]/div/div/div[1]")).getText().equals(actual)) {
			System.out.println("User is successfully able to apply the voucher for purchasing the pizza greter than Rs.500");
		} else {
			System.out.println("User is not able to apply the coupon");
		}  
		
	}
	
	//Negative test case cart value<500
	@Test
	public void m2() throws InterruptedException
	{
		
		//click on voucher
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"basket\"]/div[1]/button/div/span[2]")).click();
		
		//apply coupon code
		driver.findElement(By.name("voucherId")).sendKeys("HUT125");
		
		//click on redeem
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		//click on OK
		driver.findElement(By.xpath("//button[@class='button button--green mb-10']")).click();
        Thread.sleep(3000);
        
        //click click on pizza
		driver.findElement(By.xpath("(//button[@class='button button--md button--green flex-1 font-semibold'])[1]")).click();
		Thread.sleep(5000);
		
		// validation of voucher code
		String actual = "Voucher applied! Rs. 125 Off on bill value above Rs.500.";
		
		if (driver.findElement(By.xpath("//*[@id=\"basket\"]/div[1]/div/div/div[1]")).getText().equals(actual)) {
			System.out.println("User is successfully able to apply the voucher for purchasing the pizza equals to Rs.500");
		} else {
			System.out.println("User is not able to apply the coupon since cart value is less than 500 rs");
		}  
		
	}
	
	
	//Negative Discount-Pickup a Product which is already in a deal & Trying to get Discount
	@Test
	public void m3() throws InterruptedException
	{
		Thread.sleep(3000);
		//click on customize pizza
		driver.findElement(By.xpath("(//button[@class='sc-AxheI bqJhFB'])[1]")).click();
		Thread.sleep(5000);
		
		//choose a pizza 1st
		driver.findElement(By.xpath("//*[@id=\"DealWizardScrollContainer\"]/div[3]/div/div[1]/div/div/div[2]")).click();
		Thread.sleep(5000);
		
		//click on pizza to select
		driver.findElement(By.xpath("(//span[text()='Add'])[5]")).click();
		Thread.sleep(5000);
		
		//choose a pizza 2nd
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div/div[2]/div/div/div[2]")).click();
		Thread.sleep(5000);
		
		//click on pizza to select
		driver.findElement(By.xpath("(//span[text()='Add'])[4]")).click();
		Thread.sleep(1000);
		
		//click on add deal to basket
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[3]/div/button")).click();
		Thread.sleep(3000);
		
		//click on apply voucher code
		driver.findElement(By.xpath("//*[@id=\"basket\"]/div[1]/button/div/span[2]")).click();
		
		//apply voucher code HUT125
		driver.findElement(By.name("voucherId")).sendKeys("HUT125");
		
		// Click on redeem 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		// click on OK
		driver.findElement(By.xpath("//button[@class='button button--green mb-10']")).click();
        Thread.sleep(3000);
		
        // validation of voucher code
		String actual = "Voucher applied! Rs. 125 Off on bill value above Rs.500.";
		
		
		if (driver.findElement(By.xpath("//*[@id=\"basket\"]/div[1]/div/div/div[1]")).getText().equals(actual)) {
			System.out.println("User is successfully able to apply the voucher for purchasing the pizza equals to Rs.500");
		} else {
			System.out.println("User is not able to apply the coupon");
		}  
	}	
	
	// 
		@Test
		public void m4() throws InterruptedException
		{
			//click on 
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[3]/div[1]/div/a[2]")).click();
			
			//Scroll down to select elements
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,3500)");
			js.executeScript("window.scrollBy(0,-3500)");
			
			// select pizza one
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div[2]/div[2]/span/div[4]/a[1]/div[3]/div/button")).click();
			Thread.sleep(3000);
			
			// select pizza 2nd
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div[2]/div[2]/span/div[1]/a[1]/div[3]/div/button")).click();
			Thread.sleep(3000);
			
			//click on voucher
			driver.findElement(By.xpath("//*[@id=\"basket\"]/div[1]/button/div/span[2]")).click();
			
			// apply voucher code
			driver.findElement(By.name("voucherId")).sendKeys("HUT125");
			
			//click on redeem
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(5000);
			
			//click on OK
			driver.findElement(By.xpath("//button[@class='button button--green mb-10']")).click();
	        Thread.sleep(3000);
	        
			//  validation of voucher code
			String actual = "Voucher applied! Rs. 125 Off on bill value above Rs.500.";
			
			
			if (driver.findElement(By.xpath("//*[@id=\"basket\"]/div[1]/div/div/div[1]")).getText().equals(actual)) {
				System.out.println("User is successfully able to apply the voucher for purchasing the pizza equals to Rs.500");
			} else {
				System.out.println("User is not able to apply the coupon");
			}  
	}
	
		//After the every method close the browser
		@AfterMethod
		public void AfterMethod()
		{
//			driver.close();
		}
}
