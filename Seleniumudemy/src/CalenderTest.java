import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String MonthNumber="6";
		String DayNumber="25";
		String YearNumber="2027";
		String[] ExpectedList= {MonthNumber,DayNumber,YearNumber};
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__wrapper")).click();
		
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		/*
		 * Thread.sleep(1000); driver.findElement(By.
		 * cssSelector(".react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from"
		 * )).click(); driver.findElement(By.
		 * cssSelector(".react-calendar__tile react-calendar__decade-view__years__year")
		 * ).click();
		 */
		driver.findElement(By.xpath("//button[text()='"+YearNumber+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"))
		.get(Integer.parseInt(MonthNumber)-1).click();
		
		driver.findElement(By.xpath("//abbr[text()='"+DayNumber+"']")).click();
		
		//assertion
		
		List<WebElement> ActualList=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		for(int i=0;i<ActualList.size();i++)
		{
			System.out.println(ActualList.get(i).getAttribute("Value"));
			Assert.assertEquals(ActualList.get(i).getAttribute("Value"), ExpectedList[i]);
		}
	}

}
