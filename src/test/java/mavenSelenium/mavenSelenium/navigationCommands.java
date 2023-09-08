package mavenSelenium.mavenSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class navigationCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shubh\\HomeWork\\selenium\\Drivers\\edgedriver_win64.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).submit();
		
		driver.navigate().forward();
		driver.navigate().back();
        driver.navigate().refresh();
        
        driver.close();
	}

}
