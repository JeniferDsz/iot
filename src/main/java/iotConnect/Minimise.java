package iotConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Minimise {
	
	public WebDriver driver;
	public Minimise(WebDriver driver)
	{
		this.driver=driver;
	}
	By minimize=By.cssSelector("button[onclick*='minimize']");
	By room=By.xpath("//a[@id='room_305_btn']");
	public WebElement minimizewindow()
	{
		return driver.findElement(minimize);
	}
	public WebElement RoomName()
	{
		return driver.findElement(room);
	}

}
