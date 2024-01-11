package GitHub.ActionsPOC;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.http.ClientConfig;
import org.testng.annotations.Test;

public class ActionsPOCTest {
	
  static WebDriver driver;
	

  @Test
  public void MethodForGitHubAction() throws InterruptedException, MalformedURLException {
	    String baseUrl = "https://www.google.com";        
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
//        options.setHeadless(true);
        driver = new ChromeDriver(options);
        
//        DesiredCapabilities cap = new DesiredCapabilities(); 
//        ClientConfig config = ClientConfig.defaultConfig().connectionTimeout(Duration.ofMinutes(20))
//        		.readTimeout(Duration.ofMinutes(20)); // I change this 3 minute(Default) to 20 minutes.
//        cap.setPlatform(Platform.WIN10); cap.setBrowserName("chrome"); 
//        WebDriver driver = new RemoteWebDriver(new URL("https://www.google.com/wd/hub"), options);
        
        driver.get(baseUrl);
        String originalTitle = driver.getTitle();
        System.out.println(originalTitle);
        driver.close();
  }
}
