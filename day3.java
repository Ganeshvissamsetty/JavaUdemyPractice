package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void WebcarLoanLogin()
	{
		System.out.println("Web car login complete");
	}
	
	@Test(groups= {"smoke"})
	public void MobileCarloanLogin()
	{
		System.out.println("Mobile car login complete");
	}
	
	@Test
	public void APICarLoanLogin()
	{
		System.out.println("API car login complete");
	}
	@BeforeTest
	public void Beforetest()
	{
		System.out.println("i will run before the day 3 tests runs");
	}
	@AfterTest
	public void Aftertest()
	{
		System.out.println("i will run AFTER the day 3 tests runs");
	}
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("i will run before the suite runs as i am The NO 1");
	}
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("i will run After all the suite runs as i am The NO 1 from LAST");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("i will run everytime before the every method in day 3 runs ");
	}
	
	@AfterMethod(groups= {"smoke"})
	public void AfterMethod()
	{
		System.out.println("i will run everytime AFTER the every method in day 3 runs ");
	}
	
	
}
