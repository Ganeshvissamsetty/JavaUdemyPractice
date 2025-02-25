import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.util.Iterator;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> Windows=driver.getWindowHandles();
		Iterator<String> It=Windows.iterator();
		
	   String parentID =It.next();
	   String childID=It.next();
	   
	   driver.switchTo().window(childID);
	   System.out.println(driver.findElement(By.xpath("//div/p[@class='im-para red']")).getText());
	   String WholeText=driver.findElement(By.xpath("//div/p[@class='im-para red']")).getText();
	   String SplittedText1 = WholeText.split("at")[1];
	   String SplittedText2 = SplittedText1.split("with")[0];
	   String SplittedText3 = SplittedText2.trim();
	   driver.switchTo().window(parentID);
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys(SplittedText3);
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("learning");
	   driver.findElement(By.xpath("(//label/span[@class='checkmark'])[2]")).click();
	   driver.switchTo().alert().accept();
	  
	}

}
