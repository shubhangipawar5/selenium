package mavenSelenium.mavenSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shubh\\HomeWork\\selenium\\Drivers\\edgedriver_win64.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		// Select class is used to work on DropDown.
		// syntax- < Select select = new Select(WebElement webelement);>

		WebElement ddEl = driver.findElement(By.id("dropdown-class-example"));

		Select dropdown = new Select(ddEl);          //***************IMP*********

		System.out.println(dropdown.isMultiple()); // To check if we can select multiple dropdown option//returns
													// Boolean
		/*
		 * //1. select by Text/visible Text dropdown.selectByVisibleText("Option1");
		 * 
		 * 
		 * //2. select by value dropdown.selectByValue("option2");
		 * 
		 * 
		 * //3. select by Index dropdown.selectByIndex(3);
		 */

		/* dropDown options 
		// * 1. getOptions() - returns list of options
		List<WebElement> allEl = dropdown.getOptions();
		System.out.println("all options size: " + allEl.size());
		for (WebElement el : allEl) {
			System.out.println(el.getText());
*/
		
	/* select multiple dropdowns
	 Select oSel = new Select(driver.findElement(By.xpath(//*[@id='cars']);

if(oSel.isMultiple()){
	
	//Selecting multiple values by index
	oSel.selectByIndex(1);
	oSel.selectByIndex(2);

	//Or selecting by values
	oSel.selectByValue("volvo");
	oSel.selectByValue("audi");

	//Or selecting by visible text
	oSel.selectByVisibleText("Volvo");
	
	 */
		
	/*deSelecting options
deselectAll()
deselectByIndex()
deselectByValue()
deselectByVisibleText()	
	 */
		}

	//}

}
