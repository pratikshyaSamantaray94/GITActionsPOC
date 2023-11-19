package GitHub.ActionsPOC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActionsPOCTest {
	
  static WebDriver driver;
	
  @Test
  public void ActionsPOC() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("Added one commit for run4");
		driver.close();
  }
}
