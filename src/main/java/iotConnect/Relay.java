package iotConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Relay {

	public WebDriver driver;
	public Relay(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By toggle=By.xpath("//select[@id='triggerRelay']");
	By onoff=By.xpath("//select[@id='triggerAction']");
	public WebElement selecttest()
	{
		return driver.findElement(toggle);
	}
	public WebElement onofftest()
	{
		return driver.findElement(onoff);
	}

	
	
}
