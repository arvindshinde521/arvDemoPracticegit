package FacebookLaunch;

import java.sql.Driver;
import java.sql.DriverAction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class launchTheLogin {
	
	public void login() {
System.setProperty("webdriver.chrome.driver", "E:\\Arvind test data\\testing\\evidence-2\\ChromeDriverfile\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailField =driver.findElement(By.id("email"));
		
		emailField.sendKeys("ganesh@gmail.com");
		
		WebElement passField = driver.findElement(By.id("pass"));
		
		passField.sendKeys("1200690257");
		
		WebElement loginClick = driver.findElement(By.name("login"));
		
		loginClick.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
		
	}
	public static void main(String[] args) {
		
		launchTheLogin obj1 = new launchTheLogin();
		
		obj1.login();
		}
}
