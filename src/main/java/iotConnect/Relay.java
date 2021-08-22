package iotConnect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Relay {

	public WebDriver driver;
	public Relay(WebDriver driver)
	{
		this.driver=driver;
	}

	By toggle=By.xpath("//div[@class='slider round']");

	public List<WebElement> toggleonoff()
	{
		List<WebElement> total=driver.findElements(toggle);
		for(int i=0;i<total.size();i++)
		{
			total.get(i).click();
		}
		return total;
	}

	
}
