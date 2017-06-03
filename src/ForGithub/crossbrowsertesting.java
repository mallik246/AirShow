package ForGithub;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsertesting
{
     public WebDriver driver;
    @Test
     @Parameters("Browser")
     public void Selectbrowser(String browser)
     {
    	 if (browser.equalsIgnoreCase("firefox"))
    	 {
    		 System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Webdriver\\geckodriver.exe");
    		 driver = new FirefoxDriver();
    		 
    	 }
    	 else if (browser.equalsIgnoreCase("Chrome"))
    	 {
    		 System.setProperty("Webdriver.Chrome.driver", "C:\\Program Files\\Webdriver\\chromedriver.exe" );
    		 driver = new ChromeDriver();
    	 }
    	 else if (browser.equalsIgnoreCase("IE"))
    	 {
    		 System.setProperty("Webdriver.IE.driver", "C:\\Program Files\\Webdriver\\IEDriverServer.exe");
    		 driver = new InternetExplorerDriver();
    	 }
    	 driver.manage().window().maximize();
    	 driver.get("https://www.facebook.com/");
    	 System.out.println(driver.getTitle());
    	 driver.quit();
     }
}
     

