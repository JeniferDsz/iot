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
	By device=By.xpath("//a[contains(@aria-controls,'tab_')]");
	By minimize=By.cssSelector("button[onclick*='minimize']");
	By status=By.cssSelector("span[id*=-offlineTime]");
	By room=By.xpath("//a[@id='room_305_btn']");
	public WebElement deviceclick()
	{
		return driver.findElement(device);
	}
	public WebElement devicestatus()
	{
		return driver.findElement(status);
	}
	public WebElement minimize() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.findElement(minimize);
	}
	public WebElement RoomName()
	{
		return driver.findElement(room);
	}

}
