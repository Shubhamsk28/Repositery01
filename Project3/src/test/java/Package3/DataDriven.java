package Package3;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDriven
{
	@Test(priority = 1, enabled = false)
	public void d() throws InterruptedException 
	{
		System.out.println("d");
		Thread.sleep(2000);
	}
	
	@BeforeTest
	public void c() throws InterruptedException
	{
		System.out.println("c");
		Thread.sleep(2000);
	}
	
	@Test(priority = 3, enabled = true)
	public void b() throws InterruptedException
	{
		System.out.println("b");
		Thread.sleep(2000);
	}
	
	@Test
	public void a() throws InterruptedException
	{
		System.out.println("a");		
		Thread.sleep(2000);
	}
	
	@Test(invocationCount = 3, invocationTimeOut = 3)
	public void e()
	{
		System.out.println("e");
		XSSFWorkbook work=new XSSFWorkbook();
	}
	
	
//	AfterTest()
//	public void f()
//	{
//		System.out.println();
//	}
//	
}
