package mavenSelenium.mavenSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.base.Verify;

import dev.failsafe.internal.util.Assert;

public class radioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shubh\\HomeWork\\selenium\\Drivers\\edgedriver_win64.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// Handle Radio buttons-  click();
		
		WebElement radiBtn = driver.findElement(By.xpath("//*[@value=\"radio1\"]"));
		radiBtn.click();
		
		
/* Validation On Radio Btn
->isSelected(): Checks whether a radio button is selected or not.
->isDisplayed(): Checks whether a radio button is displayed on the web page or not.
->isEnabled(): Checks whether a radio button is enabled or not
 */
		
		
		
		
		
		
		
		
		
		
		

	}

}
