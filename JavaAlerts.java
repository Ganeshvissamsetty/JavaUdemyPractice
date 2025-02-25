import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Text = "I am Ganesh";
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement (By.cssSelector("button[onclick='jsAlert()']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys(Text);
		driver.switchTo().alert().accept();
		// Thread.sleep(2000);
		String Actual = driver.findElement(By.id("result")).getText();
		String[] array = Actual.split(":");
		String array1 = array[1].trim();
		assertEquals(array1, Text);

	}

}
