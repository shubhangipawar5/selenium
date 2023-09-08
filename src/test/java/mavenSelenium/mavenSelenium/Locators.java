package mavenSelenium.mavenSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {
//1. Basic Locating strategy-> By Id, class, Tagname, link text, partial link text
//2.customised locating srtategy-> By CSS , XPATH
		
		//Finding Web Elements
//1. findElement();  ->returns single web element
//2.findElements();  ->returns list of web element
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubh\\HomeWork\\selenium\\Drivers\\edgedriver_win64.exe");
		WebDriver driver = new EdgeDriver();
		//driver.get("https://www.saucedemo.com/");
/*		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		
		//switch to product page  (optional)
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		
		//with complete text
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		
		//with partial unique text
		//driver.findElement(By.partialLinkText("Backpack")).click();
		
		//findElemnts() -> returns list
		
		List <WebElement> elementsList = driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Length of webElements: " + elementsList.size());
		
		
		
//CSS Locators  ***********************************************************
		WebElement priseEl = driver.findElement(By.cssSelector("div.inventory_details_price"));
		System.out.println(priseEl.getText());
		//By ID Only
	   // driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack")).click();
	    
		//By Tagname, attribute and value
		driver.findElement(By.cssSelector("button[id=add-to-cart-sauce-labs-backpack]")).click();
		
		//By TagName, class, attribute and value
				
	    driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		
		// By substring -> startswith = ^ , endswith = $ , contains = *
		
	    driver.findElement(By.cssSelector("button[id$=backpack]")).click();
	    
*/	  
		
//XPATH Locators ****************************************************************************		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
/*		
//Relative Xpath[with single attribute] - starts from that element only and starts with  double slash//
		WebElement homeEl =  driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[1]"));
		//OR   ->  (//*[@class="btn btn-primary"])[1];
		String homeTxt = homeEl.getText();
		System.out.println(homeTxt);
		
//Absolute xpath starts from the root node and written with single slash - /
		
		WebElement homeElem =  driver.findElement(By.xpath("html /body/header/div/a/button"));
		String elText = homeElem.getText();
		System.out.println(elText);
		
//Relative xpath [with multiple attribute]
		 
		 driver.findElement(By.xpath("//input[@value="radio1"][@class="radioButton"]");
		 //OR ->    driver.findElement(By.xpath("//*[@value="radio1"][@class="radioButton"]");
		
*/
		
		
		//Dynamic xpath
		
//1.  Contains():used when the value of any attribute changes dynamically
		//Ex:  (//*[contains(@name,'radio')])[1];
		///OR ->       (//input[contains(@name,'radio')])[1]
		
//more ex-> Xpath=//*[contains(text(),'txtValue')]
//				Xpath=//*[contains(@href,'guru99.com')]
		
// 2. Using OR & AND:
		
	//	OR Xpath=//*[@type='submit' or @name='btnReset']
	//	AND Xpath=//*[@type='submit' or @name='btnLogin']
	
		
		
// 3.  Xpath Starts-with
		//XPath starts-with() is a function used for finding the web element whose attribute value gets changed on refresh or by other dynamic operations on the webpage.
		//ex->  //input[starts-with(@value,"radio")];
		
		
//4. text() method
		//ex.-> //legend[text()="Radio Button Example"];
		
		
		
/*XPath axes methods:
		These XPath axes methods are used to find the complex or dynamic elements.
		
1) Following:
Selects all elements in the document of the current node( ) [ UserID input box is the current node] as shown in the below screen.

ex-Xpath=//*[@type='text']//following::input[1];



2) Ancestor:
The ancestor axis selects all ancestors element (grandparent, parent, etc.) of the current node.

ex-(//fieldset)[1]/ancestor::div    [fieldset is current node and Div are ancestors)
Xpath=//*[@type='submit']//ancestor::input

3) child : all childs of current node
ex- (//fieldset)[1]/child::label      [fieldsetis currentnode and label are childs]
Xpath=//*[@type='submit']//child::input

4) Preceding:
Select all NODES that come before the current node as shown in the below screen.
Ex- (//fieldset)[1]/preceding::h1     [h1 is the prceding Node]
Xpath=//*[@type='submit']//preceding::input[1]


5) Following sibling
Select the following siblings of the context node. Siblings are at the same level of the current node
ex- Table element in table td-table data is sibling

//login and reset buttons are siblings
xpath=//*[@type='submit']//following-sibling::input


6) Parent 
Xpath=//*[@id='rt-feature']//parent::div[1]

7) Descendant - Selects the descendants of the current node
Xpath=//*[@id='rt-feature']//descendant::a[1]

		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.quit();

	}

}
