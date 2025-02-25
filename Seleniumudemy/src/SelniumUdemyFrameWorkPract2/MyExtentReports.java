
package SelniumUdemyFrameWorkPract2;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class MyExtentReports {

	ExtentReports extent;
	
	@BeforeTest
	public void config()
	{
		// #ExtentReports  #ExtentSparkReporter
		String filePath = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter Reporter = new ExtentSparkReporter(filePath);
		Reporter.config().setReportName("Standalone Test Web Automation results");
		Reporter.config().setDocumentTitle("Test results");
		
		 extent = new ExtentReports();
		extent.attachReporter(Reporter);
		extent.setSystemInfo("testet", "Ganesh");
		
	}
	
	@Test
	public void extentReports()
	{
		extent.createTest("extent reports");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		extent.flush();
		
	}
}
