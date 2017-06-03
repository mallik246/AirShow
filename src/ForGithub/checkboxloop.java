package ForGithub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class checkboxloop
{
	@Test
	public void checkbox() throws Throwable
	{
	
	 System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Webdriver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	 driver.get("https://www.mozilla.org/en-US/newsletter/firefox/?utm_campaign=desktop&utm_medium=tiles&utm_source=directory-tiles&utm_term=firefoxnewsletterv2");
	 driver.manage().window().maximize();
	 Thread.sleep(4000);
	 WebElement chkbox = driver.findElement(By.xpath("//*[@id='id_privacy']"));
	 for (int i=0; i<2; i++){
		 chkbox.click();
		 System.out.println(chkbox.isSelected());
	 }
	

}

	
}
