import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wgspractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Ganesh vissamsetty");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("wipro@123");
		driver.findElement(By.xpath("//textarea[@name='comments']")).clear();
		driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("I am learning Selenium");
	}

}
