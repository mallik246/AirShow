package ForGithub;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class windowhandel {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Webdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		 Thread.sleep(5000);
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[@data-pid='23']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[@tabindex='2']")).click();
		 Thread.sleep(4000);
		Set <String> allwin=driver.getWindowHandles();
		System.out.println(allwin.size());
		Iterator <String> it = allwin.iterator();
		String win_1 = it.next();
		String win_2 = it.next();
		driver.switchTo().window(win_2);
		driver.findElement(By.id("FirstName")).sendKeys("proshanta");
		driver.findElement(By.xpath("//*[@id='LastName']")).sendKeys("mallik");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='GmailAddress']")).sendKeys("proshanta246");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='PasswdAgain']")).sendKeys("12345");
		Thread.sleep(3000);
		//WebElement month_drop=driver.findElement(By.id(":0")).click();
		//Select month_dd=new Select(month_drop);
		//month_dd.selectByVisibleText("July");
	
		
		driver.findElement(By.linkText("Learn more")).click();
		allwin=driver.getWindowHandles();
		System.out.println(allwin.size());
		it = allwin.iterator();
		 win_1 = it.next();
		 win_2 = it.next();
		 Thread.sleep(3000);
		 String win_3 = it.next();
		 driver.switchTo().window(win_3);
		 driver.findElement(By.name("name")).click();
		 driver.findElement(By.xpath(".//*[@id='promotion-yt_promo']/div[2]/p/a")).click();
		 Thread.sleep(4000);
       driver.findElement(By.xpath("//button[@data-action='close']")).click();

	}

}
