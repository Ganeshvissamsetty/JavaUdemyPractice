import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.Urls;

public class BrokenLinks {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement footerDriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		List<WebElement> AllFootLinks=footerDriver.findElements(By.tagName("a"));
		System.out.println(AllFootLinks.size());
		
		String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		HttpURLConnection conn =(HttpURLConnection) new URL(url).openConnection();
		  conn.setRequestMethod("HEAD"); conn.connect(); 
		  int respCode =conn.getResponseCode(); 
		  System.out.println(respCode);
		//getting all links printed?
		/*
		  for(WebElement Footurl:AllFootLinks ) { String
		  url=Footurl.getAttribute("href");
		  System.out.println(Footurl.getAttribute("href")); 
		  HttpURLConnection conn =(HttpURLConnection) new URL(url).openConnection();
		  conn.setRequestMethod("HEAD"); conn.connect(); int respCode
		  =conn.getResponseCode(); System.out.println(respCode); }
		*/ 
		
		
		
		
	}

}
