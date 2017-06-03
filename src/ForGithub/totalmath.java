package ForGithub;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class totalmath {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Webdriver\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			 driver.get("https://www.facebook.com/");
			 driver.manage().window().maximize();
			 
			 WebElement month_dropdown = driver.findElement(By.xpath(".//*[@id='month']"));
			 Select month_dd= new Select(month_dropdown);
			 List<WebElement>month_list=month_dd.getOptions();
			int total_month=month_list.size();
			System.out.println("Total month count is >>>>"+total_month);
			
			for(WebElement ele:month_list)
			{
				String month_name=ele.getText();
				System.out.println("Month are ...."+month_name);
			}

	}
	

}
