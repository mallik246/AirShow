package ForGithub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframeDemo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Webdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.barnesandnoble.com/");
		int total_frames=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total frame are " + total_frames);
		driver.findElement(By.xpath(".//*[@id='newsletterEmail']")).sendKeys("proshanta246@gmail.com");
		driver.findElement(By.xpath(".//*[@id='emailSignupForm']/fieldset/input[4]")).click();
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		driver.findElement(By.xpath(".//*[@id='signInLink']/b")).click();
		driver.switchTo().frame(driver.findElement(By.xpath(".//div[@data-modal-name='login']/iframe")));
		Thread.sleep(9000);
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("proshanta246@gmail.com");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("12345");
		driver.findElement(By.xpath(".//*[@id='loginForm']/fieldset/ul/li[4]/fieldset/input[1]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(".//*[@id='myAccountLink']")).click();

	}

}


/*public void handleIframe(WebDriver driver, String siteUrl, String webelement){
	driver.get(siteUrl);
	int total_frames=driver.findElements(By.tagName(webelement)).size();
	System.out.println("Total frames are " + total_frames);
	driver.findElement(By.xpath(".//*[@id='newsletterEmail']")).sendKeys("proshanta246@gmail.com");
	driver.findElement(By.xpath(".//*[@id='emailSignupForm']/fieldset/input[4]")).click();
	driver.findElement(By.xpath("//a[@title='Close']")).click();
	driver.findElement(By.xpath(".//*[@id='signInLink']/b")).click();
	driver.switchTo().frame(driver.findElement(By.xpath(".//div[@data-modal-name='login']/iframe")));
	Thread.sleep(9000);
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("proshanta246@gmail.com");
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("12345");
	driver.findElement(By.xpath(".//*[@id='loginForm']/fieldset/ul/li[4]/fieldset/input[1]")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath(".//*[@id='myAccountLink']")).click();

}*/