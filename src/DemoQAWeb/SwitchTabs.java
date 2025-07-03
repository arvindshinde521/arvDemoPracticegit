package DemoQAWeb;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTabs {

	public static void main(String[] args) {

		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demoqa.com/");
	
	WebElement AlertWindows = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
	
	AlertWindows.click();
	
	WebElement newPageLinks = driver.findElement(By.xpath("//span[text()= 'Browser Windows']"));
	
	newPageLinks.click();
	
	WebElement opeNewPage = driver.findElement(By.xpath("//button[@id='tabButton']"));
	
	opeNewPage.click();
	
	Set<String> handles =driver.getWindowHandles();
	
	// Convert Set to List
	List<String> handleList = new ArrayList<>(handles);

	// Switch to 2nd tab (index starts from 0)
	driver.switchTo().window(handleList.get(1));
	
	String currentURL =driver.getCurrentUrl(); //We got the current URL and stored in currentURL
	
	if(currentURL.contains("/sample")) { // applied the condition.
		System.out.println("You changed tab successfully.");
	}
	else {
		System.out.println("You have not changed your tab controll");
	}

	
	}

}
