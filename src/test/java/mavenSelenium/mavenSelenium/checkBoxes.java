package mavenSelenium.mavenSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class checkBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shubh\\HomeWork\\selenium\\Drivers\\edgedriver_win64.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
//Handling checkboxes   -click() to click on checkbox
		
	WebElement	checkbxEl1 = driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]"));
	
	checkbxEl1.click();
	
	
//validation on check noxes
	
	//1.isSelected()
	/*
	List<WebElement> checkbxLst = driver.findElements(By.xpath("//*[@id=\"checkbox-example\"]//input"));
	for(WebElement el: checkbxLst) {
		boolean checkSel = el.isSelected();
		if(checkSel == false) {
			el.click();
		}
	}
*/
	 //2.isDisplayed();
WebElement	checkbxEl2 = driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]"));
	
	System.out.println(checkbxEl1.isDisplayed());
	
	if(checkbxEl2.isDisplayed() == true) {
		checkbxEl2.click();
	}

	
	//3.isEnabled();
	WebElement	checkbxEl3 = driver.findElement(By.xpath("//*[@id=\"checkBoxOption3\"]"));
	
	System.out.println(checkbxEl3.isEnabled());
	if(checkbxEl3.isEnabled() == true) {
		checkbxEl3.click();
	}
	}

}
