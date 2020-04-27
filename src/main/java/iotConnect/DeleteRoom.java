package iotConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteRoom {
	
	public WebDriver driver;
	public DeleteRoom(WebDriver driver)
	{
		this.driver=driver;
	}
	By room=By.xpath("//li[@class='list-group-item'] //following-sibling::a");
	By delete=By.xpath("//button[@id='delRoomBtn']");
	By text=By.xpath("//div[@id='dialog-alert']");
	By accept=By.xpath("//button[contains(text(),'Ok')]");
	By text1=By.xpath("//div[@id='dialog-alert']");
	By accept1=By.xpath("//button[contains(text(),'Ok')]");
	public WebElement RoomName()
	{
		return driver.findElement(room);
	}
	public WebElement Roomtodelete() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.findElement(delete);
	}
	public WebElement AlertText() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.findElement(text);
	}
	public WebElement Acceptalert()
	{
		return driver.findElement(accept);
	}
	public WebElement AfterRemoveText() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.findElement(text1);
	}
	public WebElement Removedalert()
	{
		return driver.findElement(accept1);
	}
}
