package DemoQAWeb;

import java.lang.module.FindException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class DemoAutomation {


	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
	    WebElement elementCard = driver.findElement(By.xpath("//h5[text()='Elements']"
	    		));
	    
	    elementCard.click();
	    
	    WebElement openLink = driver.findElement(By.xpath("//span[text()= 'Links']"));
	    
	    openLink.click();
	    
	    WebElement homeLink = driver.findElement(By.xpath("//a[@id='dynamicLink']"));
	    
	    homeLink.click();
	    
	    String parentWindowId = driver.getWindowHandle();
	    
	    Set<String>AllowAllWindoId = driver.getWindowHandles();
	    
	    for (String str:AllowAllWindoId) {
	    	if(!parentWindowId.equals(str)) {
	    		driver.switchTo().window(str);
	    	}
	    }
	    
	    WebElement clickOnForm = driver.findElement(By.xpath("//h5[text()='Forms']"));
	    
	    clickOnForm.click();
	    
	    Thread.sleep(4000);   // Wait for 4 seconds
	    driver.quit();        // Closes all tabs a

	}

}
