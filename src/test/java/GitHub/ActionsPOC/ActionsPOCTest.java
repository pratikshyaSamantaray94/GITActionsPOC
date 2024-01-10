package GitHub.ActionsPOC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ActionsPOCTest {
	
  static WebDriver driver;
	

  @Test
  public void MethodForGitHubAction() throws InterruptedException {
	    String baseUrl = "https://www.google.com";        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        driver = new ChromeDriver(options);
        driver.get(baseUrl);
        String testTitle = "Free QA Automation Tools For Everyone";
        String originalTitle = driver.getTitle();
        System.out.println(originalTitle);
        
        driver.close();
  }
}
