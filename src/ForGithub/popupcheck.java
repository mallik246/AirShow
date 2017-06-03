package ForGithub;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class popupcheck {
  
	@Test
	public popupcheck() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Webdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver.manage().window().maximize();
		 driver.findElement(By.name("proceed")).click();
		 Alert al=driver.switchTo().alert();
		Thread.sleep(4000);
		 System.out.println("Alert text" + al.getText());
		 al.accept();
		 driver.switchTo().defaultContent();
		 
		 System.out.println("Go button text:"+driver.findElement(By.name("proceed")).getAttribute("value"));

	}

}
