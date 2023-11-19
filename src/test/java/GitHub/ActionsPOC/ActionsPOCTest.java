package GitHub.ActionsPOC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ActionsPOCTest {
	
  static WebDriver driver;
	
  @Test
  public void ActionsPOC() throws InterruptedException {
	    //System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  	ChromeOptions co = new ChromeOptions();
	  	co.setBrowserVersion("beta");
		driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		System.out.println("Added one commit for run4");
		driver.close();
  }
}
