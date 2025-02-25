import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TfsLogining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://10.237.22.70:8080/tfs");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert1.getText());
		
		
	}

}
