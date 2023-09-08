package mavenSelenium.mavenSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class webdriverElementCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shubh\\HomeWork\\selenium\\Drivers\\edgedriver_win64.exe");
		WebDriver driver = new EdgeDriver();
/*		driver.get("https://www.saucedemo.com/");

		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		e1.sendKeys("abc");
		e1.clear();

		
		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]"));
		  boolean status =e2.isDisplayed();
		if(status) {
			System.out.println("tesr Case Passed");
		}
		else {
			System.out.println("failed");
		}
		
        WebElement e3 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        if(e3.isEnabled()) {
        	System.out.println("passed");
        }
 */
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement e4 = driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]"));
		e4.click();
		if(e4.isSelected()) {
			System.out.println("passed");
		}
		
		String eltext = e4.getText().trim();
		System.out.println(eltext);
	    if(eltext.equals("Option1")) {
	    	
	    	System.out.println("Text is correct");
	    }
		
		else {
			System.out.println("incorrect text");
		}
		
	    System.out.println(e4.getTagName());
	    System.out.println(driver.findElement(By.xpath("/html/body/header")).getClass());
	    System.out.println(e4.getAttribute("name"));
	    System.out.println(e4.getCssValue("color"));
	    System.out.println(e4.getSize());
	    System.out.println(e4.getLocation());
	    
	    
	    
	    driver.quit();
	    
	    
	}

}
