package GitHub.ActionsPOC;

import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsPOCTest {
	
  static WebDriver driver;
	

  @Test
  public void MethodForGitHubAction() throws InterruptedException {
	    String baseUrl = "https://www.google.com";        
      //ChromeOptions options = new ChromeOptions();
      //options.addArguments("--headless");
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.get(baseUrl);
	  String pageTitle = driver.getTitle();
      System.out.println("Page Title: " + pageTitle);
      String timeStamp = new SimpleDateFormat("yyyy.MM.dd---HH.mm.ss").format(new java.util.Date());
      Reporter.log(timeStamp);
      //String testTitle = "Free QA Automation Tools For Everyone";
      //String originalTitle = driver.getTitle();
      driver.close();
      
  }
}
