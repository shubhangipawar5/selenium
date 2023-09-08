package mavenSelenium.mavenSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class basicBrowserCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shubh\\HomeWork\\selenium\\Drivers\\edgedriver_win64.exe");
		WebDriver driver = new EdgeDriver();
		
		//get()  loads new url on current browser
		driver.get("https://www.saucedemo.com/");
		
		//manage()  ->Gets the Option interface.
		//getsize()  -> Get the size of the current window.
		Dimension size = driver.manage().window().getSize(); 
		System.out.println(size);
		
		// getCurrentUrl(): Get a string representing the current URL that the browser is looking at.
		String curUrl = driver.getCurrentUrl();
		System.out.println(curUrl);
		
		
		// getTitle(): The title of the current page.
		String curTitle = driver.getTitle();
		System.out.println(curTitle);
		
		//getPageSource(): Get the source of the last loaded page.
		String src = driver.getPageSource();
		//System.out.println(src);
		
		//navigate(): An abstraction allowing the driver to access the browser's history and to navigate to a given URL.
		
		/*
		 * quit(): Quits this driver, closing every associated window.
          * close(): Close the current window, quitting the browser if it's the last window currently open.

          * switchTo(): Send future commands to a different frame or window.
          * getWindowHandle(): Return an opaque handle to this window that uniquely identifies it within this driver instance.
✅ getWindowHandles(): Return a set of window handles which can be used to iterate over all open windows of this WebDriver instance by passing them to switchTo().WebDriver.Options.window()
		 */
        driver.navigate().to("https://www.webdriveruniversity.com/");
		String winhndl1 = driver.getWindowHandle();
		System.out.println(winhndl1);
		
		driver.findElement(By.xpath("//*[@id=\"udemy-promo-thumbnail\"]/p[1]/a")).click();
		driver.switchTo();
		Set<String> s1= driver.getWindowHandles();
		System.out.println(s1);
		
		
		
		//driver.close();
	}

}
