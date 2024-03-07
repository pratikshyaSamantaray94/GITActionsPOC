package GitHub.ActionsPOC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsPOCTest2 {
	
  static WebDriver driver;
	

  @Test
  public void openLandingPageWithAssert() throws InterruptedException {
	String baseUrl = "https://app.bugbug.io/sign-up/";        
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless=new");
        driver = new ChromeDriver(options);
        driver.get(baseUrl);
	    String expectedTitle = "Get started with new title - BugBug.io";
        String originalTitle = driver.getTitle();
	    Assert.assertEquals(originalTitle,expectedTitle);
        driver.close();
}
  
}
