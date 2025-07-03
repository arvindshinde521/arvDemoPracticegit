package URLlaunch;

import java.lang.module.FindException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FbCreateAccount {
	
	public void fbaccount() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Arvind test data\\testing\\evidence-2\\ChromeDriverfile\\chromedriver-win64\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver(); //launched browser
		
		driver.get("https://www.facebook.com/"); //launched URL
		
		WebElement createButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
		createButton.click();	
		
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		firstname.sendKeys("Arvind");
		
		WebElement lastname = (WebElement) driver.findElements(By.xpath("//@input[name='/02tname']"));
	}
	

	public static void main(String[] args) {

		FbCreateAccount obj = new FbCreateAccount();
		
		obj.fbaccount();
		
		
	}

}
