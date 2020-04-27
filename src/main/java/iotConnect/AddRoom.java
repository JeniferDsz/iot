package iotConnect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddRoom {

	public WebDriver driver;
	public AddRoom(WebDriver driver)
	{
		this.driver=driver;
	}
	By room=By.xpath("//a[@onclick='addRoom()']");
	By roomname=By.xpath("//input[@id='newRoomName']");
	By submit=By.xpath("//button[contains(text(),'Ok')]");
	By alertText=By.xpath("//div[@id='dialog-alert']");
    By alertaccept=By.xpath("//button[contains(text(),'Ok')]");
	public WebElement Roomclick()
	{
		WebDriverWait w=new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(room));
		return driver.findElement(room);
	}
	public WebElement AddRoomname()
	{
		
		return driver.findElement(roomname);
	}
	public WebElement SubmitRoom()
	{
		WebDriverWait w=new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(submit));
		return driver.findElement(submit);
	}
	public WebElement Alertext() throws InterruptedException
	{
		Thread.sleep(2000);	
		return driver.findElement(alertText);
	}
	public WebElement AlertOk()
	{
		return driver.findElement(alertaccept);
	}
	
}
