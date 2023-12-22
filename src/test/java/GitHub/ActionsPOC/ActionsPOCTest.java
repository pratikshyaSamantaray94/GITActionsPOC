package GitHub.ActionsPOC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsPOCTest {
	
  static WebDriver driver;
	
	/*
	 * @Test public void ActionsPOC() throws InterruptedException {
	 * //System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 * WebDriverManager.chromedriver().setup(); ChromeOptions co = new
	 * ChromeOptions(); //co.setBrowserVersion("118"); driver = new
	 * ChromeDriver(co); driver.get("https://www.google.com");
	 * driver.manage().window().maximize(); Thread.sleep(5000);
	 * System.out.println("Added one commit for run");
	 * 
	 * }
	 */

  @Test
  public void NewTestActionsPOC() throws InterruptedException {
		/*WebDriverManager.chromedriver().setup();
		String baseUrl = "https://www.google.com";
        System.out.println("Launching Google Chrome browser"); 
        driver = new ChromeDriver();
        driver.get(baseUrl);
        String testTitle = "Free QA Automation Tools For Everyone";
        String originalTitle = driver.getTitle();
        driver.close();*/
	    String baseUrl = "https://www.google.com";
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--ignore-ssl-errors=yes");
//        options.addArguments("--ignore-certificate-errors");
//        options.setBrowserVersion("119");
        
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized"); // open Browser in maximized mode
//        options.addArguments("disable-infobars"); // disabling infobars
//        options.addArguments("--disable-extensions"); // disabling extensions
//        options.addArguments("--disable-gpu"); // applicable to windows os only
//        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
//        options.addArguments("--no-sandbox"); // Bypass OS security model
//        options.addArguments("--remote-debugging-port=9222");
        options.addArguments("--headless");
        //WebDriver driver = new ChromeDriver(options);
        driver = new ChromeDriver(options);
        driver.get(baseUrl);
        String testTitle = "Free QA Automation Tools For Everyone";
        String originalTitle = driver.getTitle();
        driver.close();
  }
}
