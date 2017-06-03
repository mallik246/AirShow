package ForGithub;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class alertpch {
     @Test
	public void handlealert() throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Webdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 driver.get("http://www.pch.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath(".//*[@id='uni_header']/div[2]/div[1]/div[3]/ul/li[2]/a")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='FN']")).sendKeys("proshanta");
		 driver.navigate().back();
		 driver.switchTo().alert().accept();
		 driver.switchTo().alert().dismiss();
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		 /*Thread.sleep(4000);
		WebElement link = driver.findElement(By.xpath("//div[@id='uniNavRules']//a[Text()='Privacy Policy']"));
		Actions a=new Actions(driver);
		a.moveToElement(link).perform();*/
	}

}
