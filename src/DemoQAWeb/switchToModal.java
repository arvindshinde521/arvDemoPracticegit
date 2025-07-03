package DemoQAWeb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToModal {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		
		WebElement alertFrame = driver.findElement(By.xpath("//h5[text()= 'Alerts, Frame & Windows']"));
		
		alertFrame.click();
		
		WebElement alertButtons = driver.findElement(By.xpath("//span[text()= 'Alerts']"));
		
		alertButtons.click();
		
		WebElement AlertMessage = driver.findElement(By.xpath("//button[@id='alertButton']"));
		
		AlertMessage.click();
		
		Thread.sleep(4000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();

		
	}

}
