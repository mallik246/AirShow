package ForGithub;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class titlefacebook 

{
	@Test
	public void verifytitle()
	
	{
		 System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Webdriver\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			 driver.get("https://www.facebook.com/");
			 driver.manage().window().maximize();
			 String my_title=driver.getTitle();
			 System.out.println("Title is " +my_title);
			 String expected_title=("Facebook - Log In or Sign Up ");
			 Assert.assertEquals(expected_title, my_title);
			 System.out.println("Test is complited");
			 
	}

}
