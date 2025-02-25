import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyCartAdded {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		String[] names = { "Brocolli", "Onion", "Musk Melon" };
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> ProductsList = driver.findElements(By.xpath("//div/h4[@class='product-name']"));

		for (int i = 0; i < ProductsList.size(); i++) {
			String[] ProductName = ProductsList.get(i).getText().split("-");
			String FinalProductName = ProductName[0].trim();

			List Listnames = Arrays.asList(names);
			int k = 0;
			if (Listnames.contains(FinalProductName)) {
				k++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (k == names.length) {
					break;

				}

			}

		}
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='action-block']/button[@type='button']")).click();
        
		
		
	}

}
