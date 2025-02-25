import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);

		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		WebElement SearchBox = driver.findElement(By.xpath("//input[@type='text']"));

		/*
		 * SearchBox.sendKeys(Keys.CONTROL + "a"); SearchBox.sendKeys("hello mawa bro");
		 */
		a.moveToElement(SearchBox).click().keyDown(Keys.SHIFT).sendKeys("hello mawa bro").doubleClick(SearchBox).build().perform();

		// move to specific elements
		a.moveToElement(move).contextClick().build().perform();

	}

}
