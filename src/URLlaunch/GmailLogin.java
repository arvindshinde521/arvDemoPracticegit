package URLlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v131.emulation.model.SensorMetadata;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {
	
	public void maillogin() {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.gmail.com");
		 
		WebElement emailField = driver.findElement(By.id("identifierId"));
		
		emailField.sendKeys("shindegovind764@gmail.com"); 
		
		WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
		
		nextButton.click();	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GmailLogin obj = new GmailLogin();
		
		obj.maillogin();
	}

}
