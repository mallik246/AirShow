package ForGithub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectModel
{

	WebDriver driver;
	
	By username=By.xpath("//*[@id='email']");
	By Password=By.xpath("//*[@id='pass']");
	By LogginButton=By.xpath("//*[@id='u_0_q']");
	
	public PageObjectModel(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeUserName()
	{
		driver.findElement(username).sendKeys("ayon246@yahoo.com");
	}
	
	public void typePassword()
	{
		driver.findElement(Password).sendKeys("15035-512");
	}
	
	public void clickOnLoggInButton()
	{
		driver.findElement(LogginButton).click();
	}
}
