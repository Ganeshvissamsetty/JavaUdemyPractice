import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartitemsadded {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		String[] names = { "Colgate" };
	

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.linkText("Grocery")).click();

		/*
		 * driver.findElement(By.cssSelector("input[title='Enter pincode']")).sendKeys(
		 * "522201"); a.sendKeys(Keys.ENTER).build().perform();
		 */
		/*
		 * driver.findElement(By.cssSelector("input[title='Enter pincode']")).sendKeys(
		 * "522201"); String parentWindowHandle = driver.getWindowHandle(); // Store
		 * parent window handle String subWindowHandle = null; Set<String> handles =
		 * driver.getWindowHandles(); Iterator<String> iterator = handles.iterator();
		 * while (iterator.hasNext()) { subWindowHandle = iterator.next(); }
		 * driver.switchTo().window(subWindowHandle); // Switch to the pop-up window
		 * driver.switchTo().window(parentWindowHandle); // Switch back to the parent
		 * window
		 */

		/*
		 * //driver.findElement(By.cssSelector("input[title='Enter pincode']")).click();
		 */
		driver.findElement(By.className("QqFHMw")).click();

		// for directly clicking on detect the location
		// driver.findElement(By.partialLinkText("_8z-Twi")).click();

		driver.findElement(
				By.xpath("//div/img[@src='https://rukminim2.flixcart.com/flap/50/50/image/f2f929242d71a365.jpg?q=50']"))
				.click();

		/*
		 * //displaying the image WebElement J
		 * =driver.findElement(By.xpath("//img[@alt='Oral Care']"));
		 * System.out.println(J.getAttribute("src"));
		 */
		// driver.findElement(By.xpath("//div/button[@span='Add item']")).click();

		// getting all the texts of the cart items in the page
		List<WebElement> Products = driver.findElements(By.xpath("//div[@class='dSU+Ya']"));
		Thread.sleep(2000);
		int j = 0;
		int k = 0;
		// (int i:Products.size())
		for (int i = 0; i < Products.size(); i++) {

			String[] ProductsText = Products.get(i).getText().split(" ");

			String ExactProductText = ProductsText[0].trim();
			System.out.println(ExactProductText);
			// how to get the count of all products
			j++;

			List expectedNames = Arrays.asList(names);
			// String names1="Colgate";
			if (expectedNames.contains(ExactProductText)) {
				k++;
				/*
				 * try { Thread.sleep(5000);
				 * driver.findElements(By.xpath("//button[@class='QqFHMw PxrzFS']/span")).get(i)
				 * .click();
				 * 
				 * } catch (Exception e) { System.out.println("Exception occured"); }
				 */

				//driver.findElements(By.xpath("//button[@class='QqFHMw FGZNBR']")).get(i)
				//.findElement(By.xpath("//button[@class='QqFHMw PxrzFS']/span")).click();
				
				System.out.println( driver.findElements(By.xpath("//button[@class='QqFHMw PxrzFS']/span")).get(i).getText());
			}
			System.out.println("count=" + j);
			System.out.println("count=" + k);

			System.out.println(
					"______________________________________________________________________________________________________");
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		}
	}
}
