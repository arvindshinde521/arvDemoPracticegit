package DemoQAWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DopdownValueSelect {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		WebElement formPage = driver.findElement(By.xpath("//h5[text() = 'Forms']"));
		
		formPage.click();		
		
		WebElement RealForm = driver.findElement(By.xpath("//span[text()='Practice Form']"));
		
		RealForm.click();
		
		
		//List<WebElement> stateNames = driver.findElements(By.xpath("//div[@id = 'state']"));
		
		
	}

}
