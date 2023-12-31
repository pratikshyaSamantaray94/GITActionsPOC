package GitHub.ActionsPOC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsPOCTest {
	
  static WebDriver driver;
	

  @Test
  public void MethodForGitHubAction() throws InterruptedException {
	    String baseUrl = "https://www.google.com";        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get(baseUrl);
        String testTitle = "Free QA Automation Tools For Everyone";
        String originalTitle = driver.getTitle();
        driver.close();
  }
}
