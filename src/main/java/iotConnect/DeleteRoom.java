package iotConnect;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteRoom {
	
	public WebDriver driver;
	public DeleteRoom(WebDriver driver)
	{
		this.driver=driver;
	}
	By room=By.xpath("//a[@id='room_316_btn']");
	By delete=By.xpath("//button[@id='delRoomBtn']");
	By text=By.xpath("//div[@id='dialog-alert']");
	By accept=By.xpath("//button[contains(text(),'Ok')]");
	By text1=By.xpath("//div[@id='dialog-alert']");
	By accept1=By.xpath("//button[contains(text(),'Ok')]");
	LoginAfterActivation la=new LoginAfterActivation(driver);
	
	public WebElement RoomName()
	{
		return driver.findElement(room);
	}
	public WebElement deleteRoom() throws InterruptedException
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
	
	
	public List<WebElement> roomtodelete() throws InterruptedException
	{
		List<WebElement>roomcount=driver.findElements(By.xpath("//a[contains(@class,'list-group')]"));
		for(int i=0;i<roomcount.size();i++)
		{
			if(i>1)
			{
				roomcount.get(i).click();
			}
		}
		
		return roomcount;
	}
}
