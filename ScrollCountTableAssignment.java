import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollCountTableAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		
		
		//no of rows
		List<WebElement> Allrows=driver.findElements(By.cssSelector("div fieldset table[name='courses'] tbody tr"));
		System.out.println("No of rows:"+Allrows.size());
		//no of columns
		List<WebElement> AllColumns=driver.findElements(By.cssSelector("div fieldset table[name='courses'] tbody tr th"));
		System.out.println("No of rows:"+AllColumns.size());
		
		//2nd row full printing in console
		System.out.println(driver.findElement(By.cssSelector("div fieldset table[name='courses'] tbody tr:nth-child(3)")).getText());   
	}

}
