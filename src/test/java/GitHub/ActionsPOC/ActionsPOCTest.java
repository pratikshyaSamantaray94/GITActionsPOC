package GitHub.ActionsPOC;

import java.net.MalformedURLException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class ActionsPOCTest {
	
  static WebDriver driver;
	

  @Test
  public void MethodForGitHubAction() throws InterruptedException, MalformedURLException {
	    String baseUrl = "https://www.google.com";   
	    
//	    Proxy proxy = new Proxy();
//	    proxy.setHttpProxy("<HOST:PORT>");
	    
        ChromeOptions options = new ChromeOptions();
//        options.setCapability("proxy", proxy);
//        options = webdriver.ChromeOptions();
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--ignore-ssl-errors=yes");
//        options.addArguments("--ignore-certificate-errors");
        
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        
        driver.get(baseUrl);
        String originalTitle = driver.getTitle();
        System.out.println(originalTitle);
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd---HH.mm.ss").format(new java.util.Date());
        Reporter.log(timeStamp);
        driver.close();
  }
}
