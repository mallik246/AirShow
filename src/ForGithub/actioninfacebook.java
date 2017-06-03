package ForGithub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actioninfacebook {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Webdriver\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			 driver.get("https://www.facebook.com/");
			 driver.manage().window().maximize();
			 Thread.sleep(4000);
			 Actions a=new Actions(driver);
			 WebElement link = driver.findElement(By.xpath("//input[@id='u_0_1']"));
				a.moveToElement(link).build().perform();

	}

}
