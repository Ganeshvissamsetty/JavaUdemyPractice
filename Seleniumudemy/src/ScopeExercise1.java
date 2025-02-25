import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopeExercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//find how many linktexts were there in page
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//limiting web driver scope
		WebElement FootDriver =driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(FootDriver.findElements(By.tagName("a")).size());
		WebElement FootColumnDriver =FootDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(FootColumnDriver.findElements(By.tagName("a")).size());
		

		
		//click on each link in the column and chec whether new windows were opening or not..
		
		for(int i=1;i<FootColumnDriver.findElements(By.tagName("a")).size();i++)
		{
			String ClickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			FootDriver.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLink);
			Thread.sleep(5000);
			
		}
		Set<String> WindowHandles=driver.getWindowHandles();
		Iterator<String> a = WindowHandles.iterator();
		while(a.hasNext())
		{
			driver.switchTo().window(a.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
