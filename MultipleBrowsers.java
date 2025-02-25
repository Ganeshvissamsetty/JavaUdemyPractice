import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class MultipleBrowsers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> Windows = driver.getWindowHandles();
		Iterator<String> It=Windows.iterator();
		String parentId =It.next();
		String ChildId =It.next();
		
		driver.switchTo().window(ChildId).get("https://rahulshettyacademy.com/");
		String CourseText = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
				.get(1).getText();
		
	
		driver.switchTo().window(parentId);
		
		//Taking a webelement screenshot
	WebElement NameElement =driver.findElement(By.xpath("//div/input[@class = 'form-control ng-untouched ng-pristine ng-invalid']"));
		NameElement.sendKeys(CourseText);
		
		File file =NameElement.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		
		//getting height and width of the web element
		System.out.println(NameElement.getRect().getDimension().getHeight());
		System.out.println(NameElement.getRect().getDimension().getWidth());
		
	}

}
