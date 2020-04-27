package iotConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddDevice {

	public WebDriver driver;
	public AddDevice(WebDriver driver)
	{
		this.driver=driver;
	}
	By room=By.xpath("//li[@class='list-group-item'] //following-sibling::a");
	By add=By.xpath("//button[@class='btn btn-default']");
	By Name=By.xpath("//input[@id='deviceName']");
	By id=By.xpath("//input[@id='deviceId']");
	By ok=By.xpath("//button[@class='ui-button ui-corner-all ui-widget']");
	By text=By.xpath("//div[@id='dialog-alert']");
	By alertok=By.xpath("//button[@class='ui-button ui-corner-all ui-widget']");
	By console=By.xpath("//div[@id='consoleBoard']");
	public WebElement RoomName()
	{
		return driver.findElement(room);
	}
	public WebElement addDevice()
	{
		return driver.findElement(add);
	}
	public WebElement addName()
	{
		return driver.findElement(Name);
	}
	public WebElement Addid()
	{
		return driver.findElement(id);
	}
	public WebElement acceptalert()
	{
		return driver.findElement(ok);
	}
	public WebElement alertText()
	{
		return driver.findElement(text);
	}
	public WebElement afteralert()
	{
		return driver.findElement(alertok);
	}
	public WebElement console()
	{
		return driver.findElement(console);
	}
}
