package ForGithub;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class facebookregistration {
 
	 @Test
	public void handelsdropdown() throws InterruptedException 
	{
		 System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Webdriver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();

	 WebElement month_dropdown=driver.findElement(By.xpath(".//*[@id='month']"));
	 Select month_dd=new Select(month_dropdown);
	 month_dd.selectByVisibleText("Apr");
	 Thread.sleep(4000);
	 WebElement day_dropdown=driver.findElement(By.xpath(".//*[@id='day']"));
	 Select day_dd=new Select(day_dropdown);
	 day_dd.selectByVisibleText("23");
	 Thread.sleep(4000);
	 WebElement year_dropdown=driver.findElement(By.xpath(".//*[@id='year']"));
	 Select year_dd=new Select(year_dropdown);
	 year_dd.selectByVisibleText("2017");
	 driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
	 
	 
	

	}

	
	}


