import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllMixAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//select any of the check box 
		driver.findElement(By.xpath("//FieldSet/label/input[@id='checkBoxOption2']")).click();
		
		
		//and grab the label of the selected text box
		
		String SelectedOption = driver.findElement(By.xpath("//div/Fieldset/label[@for='benz']")).getText();
		
		//select the option in the drop down that matches with the step 2
		Select  SelectObject = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		  List<WebElement>  AllDropDownOptions  =SelectObject.getOptions();
		  
		  for(WebElement Options:AllDropDownOptions)
		  {
			  String Optiontext=Options.getText();
			  if(Optiontext.equalsIgnoreCase(SelectedOption))
			  {
				  SelectObject.selectByVisibleText(Optiontext);
			  }
		  }
		//eneter the step 2 name in the fields space
		  
		  driver.findElement(By.xpath("//div/FieldSet/input[@name='enter-name']")).sendKeys(SelectedOption);
		//click on alert and cehck teh step 2 text is there in the alert text
		  
		  driver.findElement(By.xpath("//div/FieldSet/input[@id='alertbtn']")).click();
		  String AlertText =driver.switchTo().alert().getText();
		  System.out.println(driver.switchTo().alert().getText());
		  driver.switchTo().alert().accept();
		  if(AlertText.contains(SelectedOption))
		  {
			  System.out.println("All Success BABY");
		  }
		 
		  
	}

}
