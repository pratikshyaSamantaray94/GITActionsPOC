package GitHub.ActionsPOC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsPOCTest {
	
  static WebDriver driver;
	

  @Test
  public void openLandingPage() throws InterruptedException {
	    String baseUrl = "https://www.google.com";        
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless=new");
        driver = new ChromeDriver(options);
        driver.get(baseUrl);
        String originalTitle = driver.getTitle();
        driver.close();
  }
}
