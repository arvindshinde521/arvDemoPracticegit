package DemoQAWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.logs.internal.SdkLoggerProviderUtil;

public class HrmLogin {
	
	public void loginHRM() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://hrm.matrixbrains.com/");
		
		Thread.sleep(4000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		
		userName.sendKeys("Arvind.Shinde");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		password.sendKeys("Arvind@123");
		
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		submitButton.click();
		
		Thread.sleep(4000);
		
		String currentURL =driver.getCurrentUrl();	
		
		if(currentURL.contains("https://hrm.matrixbrains.com/web/index.php/dashboard/index")) {
			System.out.println("You are succesfully logged in");
		}
		
		else {
			System.out.println("Please enter the correct credentials");
		}
		
		WebElement profileDrop = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
		
		profileDrop.click();
		
		WebElement logoutButton = driver.findElement(By.xpath("//href[text()='Logout']"));
		
		logoutButton.click();
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		HrmLogin ToLogin = new HrmLogin();
		
		ToLogin.loginHRM();

	}

}
