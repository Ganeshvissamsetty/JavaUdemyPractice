
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();

		Set<String> windows = driver.getWindowHandles(); // [parentid,childid,subchildId]
		Iterator<String> a = windows.iterator();
		String parentid = a.next();
		String childid = a.next();

		driver.switchTo().window(childid);

		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

		// System.out.println(driver.findElement(By.cssSelector("div[class='example']
		// h3"+"new implementation")).getText());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://the-internet.herokuapp.com/windows/new");
		System.out.println(
				driver.findElement(By.cssSelector("div[class='example'] h3")).getText() + "new implementation");

	}

}
