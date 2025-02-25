import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		driver.findElement(By.xpath("//body/div[@id='draggable']")).click();
		
		//drag and drop
		
		Actions a = new Actions(driver);
		a.dragAndDrop(driver.findElement(By.xpath("//body/div[@id='draggable']")), driver.findElement(By.xpath("//body/div[@id='droppable']")))
		.build().perform();
		
	}

}
