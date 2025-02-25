package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2x {

	 @Parameters({"url","Heroine"}) 
	@Test(dataProvider="getData")
	public void ploan(String Username,String Password)
	{
		System.out.println("Good");
		//System.out.println(urlname);
		//System.out.println(Heroinename);
	    System.out.println(Username);
	    System.out.println(Password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0]="1st username";
		data[0][1]="1st password";
		
		data[1][0]="2nd username";
		data[1][1]="2nd password";
		
		data[2][0]="3rd userbname";
		data[2][1]="3rd password";
		return data;
	}
}
