package GitHub.ActionsPOC;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.Proxy;
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
	    
	    Proxy proxy = new Proxy();
	    proxy.setHttpProxy("<HOST:PORT>");
	    
        ChromeOptions options = new ChromeOptions();
        options.setCapability("proxy", proxy);
//        options = webdriver.ChromeOptions();
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--ignore-ssl-errors=yes");
//        options.addArguments("--ignore-certificate-errors");
        
//        options.addArguments("headless");
//        options.setHeadless(true);
        
        driver = new ChromeDriver(options);
        
        driver.get(baseUrl);
        String originalTitle = driver.getTitle();
        System.out.println(originalTitle);
        driver.close();
  }
}
