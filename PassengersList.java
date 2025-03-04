import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassengersList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		//manual
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		//while loop
		int i=0;
		while(i<3)
		{
			driver.findElement(By.id("hrefIncAdt")).click();//7 adults
			i++;
			
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//for loop
		for(int j=0;j<2;j++) 
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.id("btnclosepaxoption")).click();//8adults
	}

}
