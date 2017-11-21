package ro.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * http://toolsqa.com/selenium-tutorial/
 *
 */
public class TestExample {

	public static void main(String[] args) {
		// The Selenium client bindings will try to locate the geckodriver executable from the system PATH.
		//You will need to add the directory containing the executable to the system path
		System.setProperty("webdriver.gecko.driver", "/home/aduta/tools/geckodriver");
		// Create a new instance of the Firefox driver		
		WebDriver driver = new FirefoxDriver();
		
        //Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 
		//Wait for 5 Sec
        try{
		Thread.sleep(5000);
        }catch(Exception e){
        	
        }
		
        // Close the driver
        driver.quit();
	}

}
