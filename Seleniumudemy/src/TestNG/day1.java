package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

	@Parameters({"Heroine"})
	@Test(groups= {"smoke"})
	public void demo(String heroinename)
	{
		System.out.println("Hello");
        System.out.println(heroinename);
	}
	
	@Test
	public void secondTest()
	{
		System.out.println("bye");
	}
	
	
}
