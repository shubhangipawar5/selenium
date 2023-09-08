package mavenSelenium.mavenSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LaunchBrowsers {

	public static void main(String[] args) {
		// Launching Chrome browsers
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubh\\HomeWork\\selenium\\Drivers\\edgedriver_win64.exe");
		WebDriver driver = new EdgeDriver();
		// Launch website  
		 driver.navigate().to("http://www.google.com/");  
		 
		 //OR//
		// driver.get("http://www.google.com");
		 String mytitle = driver.getTitle();
		 System.out.println(mytitle);
		 String curUrl = driver.getCurrentUrl();
		 System.out.println(curUrl);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 driver.close();
		 //OR
		 
		//driver.quit();

	}

}
