package iotConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeviceStatus {

	public WebDriver driver;
	public DeviceStatus(WebDriver driver) 
	{
		this.driver=driver;
	}
	By device=By.xpath("//span[@id='3713700-status']");
	By status=By.xpath("//span[@id='3713700-offlineTime']");
	public WebElement deviceclick()
	{
		return driver.findElement(device);
	}
	public WebElement devicestatus()
	{
		return driver.findElement(status);
	}
}
