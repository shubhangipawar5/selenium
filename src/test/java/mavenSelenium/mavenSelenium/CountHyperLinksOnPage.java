package mavenSelenium.mavenSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CountHyperLinksOnPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shubh\\HomeWork\\selenium\\Drivers\\edgedriver_win64.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.calculator.net/");
		List<WebElement> hypLinkEl = driver.findElements(By.tagName("a"));
		System.out.println("Total Hyper links on wepage are: " + hypLinkEl.size());
		
		
driver.close();
	}

}
