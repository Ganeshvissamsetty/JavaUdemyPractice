package TestNG;

import org.testng.annotations.Test;

public class day4 {

	@Test
	public void WebHomeLoanLogin()
	{
		System.out.println("Web home login complete");
	}
	
	@Test
	public void MobileHomeloanLogin()
	{
		System.out.println("Mobile Home login complete");
	}
	@Test(groups= {"smoke"})
	public void MobileHomeloanSignIn()
	{
		System.out.println("Mobile Home Sign In complete");
	}
	@Test(groups= {"smoke"})
	public void MobileHomeloanSignOut()
	{
		System.out.println("Mobile Home Sign Out complete");
	}
	@Test
	public void MobileHomeloanProcess()
	{
		System.out.println("Mobile Home Process complete");
	}
	@Test
	public void APIHomeLoanLogin()
	{
		System.out.println("API Home login complete");
	}
	
	
}
